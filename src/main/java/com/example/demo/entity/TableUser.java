package com.example.demo.entity;


import lombok.Data;
import org.springframework.jdbc.core.RowMapper;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;

@Data
@Entity
@Table(name = "t_user")
public class TableUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false, unique = true)
    @NotEmpty(message = "名称不能为空")
    @Size(min = 1, max = 20)
    private String name;

    @Column(nullable = false)
    @NotEmpty(message = "昵称不能为空")
    @Size(min = 1, max = 20)
    private String nickname;

    @Column(nullable = false)
    @NotEmpty(message = "密码不能为空")
    @Size(min = 1, max = 20)
    private String password;

    @Size(max = 11)
    private String mobile;

    private int level;
    private Timestamp createTime;
    private Timestamp modifyTime;
}
