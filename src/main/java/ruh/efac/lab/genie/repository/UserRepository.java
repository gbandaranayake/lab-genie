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

package ruh.efac.lab.genie.repository;
/*
 * Created by GayanB
 */

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.security.crypto.bcrypt.BCrypt;
import ruh.efac.lab.genie.domain.User;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class UserRepository {
    private JdbcTemplate jdbcTemplate;

    public User getByName(String userName) {
        List<User> users = jdbcTemplate.query("select * from users where name=?", this::createUser, userName);
        return users.size() > 0 ? users.get(0) : null;
    }

    public List<User> getAllUsers() {
        return jdbcTemplate.query("select * from users", this::createUser);
    }

    public void saveUser(User user) {
        String sql = "insert into users (name, password) values (?,?)";
        List<User> result = jdbcTemplate.query(sql, this::createUser, user.getName(), user.getPassword());
        user.setId(result.get(0).getId());
    }

    private User createUser(ResultSet resultSet, int rowNum) throws SQLException {
        User user = new User();
        user.setId(resultSet.getInt("id"));
        user.setName(resultSet.getString("name"));
        user.setPassword(resultSet.getString("password"));
        return user;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
}
