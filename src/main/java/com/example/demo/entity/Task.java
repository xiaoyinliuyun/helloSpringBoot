package com.example.demo.entity;


import lombok.Data;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

@Data
public class Task implements RowMapper<Task> {

    private int id;
    private String name;
    private String goal;
    private String noteLink;
    private int state;
    private long planDate;
    private int times;
    private int priority;
    private long createTime;
    private long modifyTime;

    @Override
    public Task mapRow(ResultSet resultSet, int i) throws SQLException {
        Task task = new Task();
        task.setId(resultSet.getInt("id"));
        task.setName(resultSet.getString("name"));
        task.setGoal(resultSet.getString("goal"));
        task.setNoteLink(resultSet.getString("note_link"));
        task.setState(resultSet.getInt("state"));
        task.setPlanDate(resultSet.getInt("plan_date"));
        task.setTimes(resultSet.getInt("times"));
        task.setPriority(resultSet.getInt("priority"));
        task.setCreateTime(resultSet.getTimestamp("create_time").getTime());
        task.setModifyTime(resultSet.getTimestamp("modify_time").getTime());
        return task;
    }
}
