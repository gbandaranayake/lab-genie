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
 * Created by GayanB on
 */

import org.springframework.jdbc.core.JdbcTemplate;
import ruh.efac.lab.genie.domain.Comment;
import ruh.efac.lab.genie.domain.Instrument;
import ruh.efac.lab.genie.repository.CommentsRepository;
import ruh.efac.lab.genie.repository.InstrumentsRepository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class InstrumentsRepositoryImpl implements InstrumentsRepository {
    private JdbcTemplate jdbcTemplate;
    private CommentsRepository commentsRepository;

    //todo check validity with the updated DB schema
    @Override
    public List<Instrument> getInstruments(String labName) {
        return jdbcTemplate.query("select * from instrument", this::mapToInstrumentInst);
    }

    //todo seems not required
    @Override
    public List<Instrument> getInstruments(String labName, String instrumentName) {
        return jdbcTemplate.query("select * from instrument where instrument.item like '%" + instrumentName + "%'",
                this::mapToInstrumentInst);
    }

    @Override
    public List<Instrument> getInstrumentsByInventory(int inventoryNo) {
        return jdbcTemplate.query("select * from instrument where instrument.inventory_no = ?",
                this::mapToInstrumentInst, inventoryNo);
    }

    @Override
    public void deleteInstrumentById(long instrumentId) {
        jdbcTemplate.update("delete from instrument where instrument.id = ?", instrumentId);
    }

    @Override
    public void saveInstrument(Instrument instrument) {

    }

    @Override
    public void deleteInstrumentById(Instrument instrument) {

    }

    @Override
    public void addAll(List<Instrument> instruments) {

    }

    private Instrument mapToInstrumentInst(ResultSet resultSet, int rowIndex) throws SQLException {
        Instrument instrument = new Instrument(resultSet.getInt("id"), resultSet.getString("s_no"),
                resultSet.getString("item_code"), resultSet.getString("item_category"),
                resultSet.getString("item"), resultSet.getString("brand"));
        instrument.setSerialNo(resultSet.getString("serial_no"));
        List<Comment> allCommentsForEquipment = commentsRepository.getAllCommentsForEquipment(instrument.getId());
        instrument.setComments(allCommentsForEquipment);
        return instrument;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void setCommentsRepository(CommentsRepository commentsRepository) {
        this.commentsRepository = commentsRepository;
    }
}
