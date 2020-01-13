package com.example.demo.entity;


import lombok.Data;
import org.springframework.jdbc.core.RowMapper;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.sql.ResultSet;
import java.sql.SQLException;

@Data
@Entity
@Table(name = "t_task")
public class TableTask{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    @NotEmpty(message = "标题不能为空")
    @Size(max = 64)
    private String name;

    @Size(max = 512)
    private String goal;

    @Size(max = 256)
    private String noteLink;

    private int state;
    private long planDate;
    private int times;
    private int priority;
    private long createTime;
    private long modifyTime;
}
