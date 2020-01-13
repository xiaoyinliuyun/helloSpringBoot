package com.example.demo.entity;

import lombok.Data;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

@Data
public class Idea implements RowMapper<Idea> {

    private int id;
    private String tips;
    private int state;
    private long createTime;
    private long modifyTime;

    @Override
    public Idea mapRow(ResultSet resultSet, int i) throws SQLException {
        Idea idea = new Idea();
        idea.setId(resultSet.getInt("id"));
        idea.setTips(resultSet.getString("tips"));
        idea.setState(resultSet.getInt("state"));
        idea.setCreateTime(resultSet.getTimestamp("create_time").getTime());
        idea.setModifyTime(resultSet.getTimestamp("modify_time").getTime());
        return idea;
    }


}
