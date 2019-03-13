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
 * Created by GayanB on
 */

import org.joda.time.DateTime;
import org.springframework.jdbc.core.JdbcTemplate;
import ruh.efac.lab.genie.domain.Comment;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class CommentsRepositoryImpl implements CommentsRepository{
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<Comment> getAllCommentsForEquipment(long equipmentId) {
        return jdbcTemplate.query("select * from instrument_comments where instrument_id = ?", this::mapToComment,
                equipmentId);
    }

    @Override
    public void addComment(Comment comment) {

    }

    @Override
    public boolean deleteComment(long commentId) {
        return false;
    }

    private Comment mapToComment(ResultSet resultSet, int rowIndex) throws SQLException {
        Comment comment = new Comment();
        comment.setId(resultSet.getLong("id"));
        comment.setComment(resultSet.getString("comment"));
        comment.setUserId(resultSet.getLong("user_id"));
        comment.setInstrumentId(resultSet.getLong("instrumentId"));
        comment.setTimeStamp(new DateTime(resultSet.getTimestamp("timestamp").getTime()));
        return comment;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
}
