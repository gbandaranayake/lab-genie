/*
 * (C) Copyright 2010-2015 hSenid Mobile Solutions (Pvt) Limited.
 * All Rights Reserved.
 *
 * These materials are unpublished, proprietary, confidential source code of
 * hSenid Mobile Solutions (Pvt) Limited and constitute a TRADE SECRET
 * of hSenid Mobile Solutions (Pvt) Limited.
 *
 * hSenid Mobile Solutions (Pvt) Limited retains all title to and intellectual
 * property rights in these materials.
 */

package ruh.efac.lab.genie.service;
/*
 * Created by GayanB
 */

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import ruh.efac.lab.genie.domain.UserRole;
import ruh.efac.lab.genie.repository.UserRepository;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class UserDetailsService implements org.springframework.security.core.userdetails.UserDetailsService {
    private UserRepository userRepo;

    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        ruh.efac.lab.genie.domain.User user = userRepo.getByName(userName);

        return convertDomainUserTypeToSpringUserType(user, getUserAuthorities(user.getUserRole()));
    }

    private List<GrantedAuthority> getUserAuthorities(Set<UserRole> userRoles) {
        return userRoles.stream().map(ur -> new SimpleGrantedAuthority(ur.getRole())).collect(Collectors.toList());
    }


    private User convertDomainUserTypeToSpringUserType(ruh.efac.lab.genie.domain.User user, List<GrantedAuthority> authorityList) {
        return new User(user.getName(), user.getPassword(), user.isEnabled(), true, true, true, authorityList);
    }

    public UserRepository getUserRepo() {
        return userRepo;
    }

    public void setUserRepo(UserRepository userRepo) {
        this.userRepo = userRepo;
    }
}
