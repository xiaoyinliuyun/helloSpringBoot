package com.example.demo.entity;


import lombok.Data;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

@Data
public class User implements RowMapper<User> {
    private int id;
    private String name;
    private String nickname;
    private String password;
    private String mobile;
    private int level;
    private long createTime;
    private long modifyTime;

    @Override
    public User mapRow(ResultSet resultSet, int i) throws SQLException {
        User user = new User();
        user.setId(resultSet.getInt("id"));
        user.setName(resultSet.getString("name"));
        user.setNickname(resultSet.getString("nickname"));
        user.setPassword(resultSet.getString("password"));
        user.setMobile(resultSet.getString("mobile"));
        user.setLevel(resultSet.getInt("level"));
        user.setCreateTime(resultSet.getTimestamp("create_time").getTime());
        user.setModifyTime(resultSet.getTimestamp("modify_time").getTime());
        return user;
    }
}
