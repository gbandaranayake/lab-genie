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

package ruh.efac.lab.genie.repository.impl;
/*
 * Created by GayanB
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import ruh.efac.lab.genie.domain.Laboratory;
import ruh.efac.lab.genie.repository.LaboratoryRepository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class LabRepoImpl implements LaboratoryRepository {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public List<Laboratory> getAllLabs() {
        return jdbcTemplate.query("select * from laboratory", this::mapToLaboratory);
    }

    private Laboratory mapToLaboratory(ResultSet resultSet, int rowIndex) throws SQLException {
        Laboratory laboratory = new Laboratory();
        laboratory.setId(resultSet.getInt("id"));
        laboratory.setName(resultSet.getString("name"));
        laboratory.setDetails(resultSet.getString("details"));
        return laboratory;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
}
