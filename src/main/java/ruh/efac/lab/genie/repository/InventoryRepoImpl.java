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

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import ruh.efac.lab.genie.domain.Inventory;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class InventoryRepoImpl implements InventoryRepository{
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<Inventory> getAllForLab(int labId) {
        return jdbcTemplate.query("Select * from inventory i join laboratory l where l.id = i.lab and l.id = ?",
                this::mapToInventoryInst, labId);
    }

    private Inventory mapToInventoryInst(ResultSet resultSet, int rowIndex) throws SQLException {
        Inventory inventory = new Inventory();
        inventory.setId(resultSet.getInt("id"));
        inventory.setName(resultSet.getString("name"));
        inventory.setDetails(resultSet.getString("details"));
        inventory.setNo(resultSet.getInt("no"));
        inventory.setLabId(resultSet.getInt("lab"));
        return inventory;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
}
