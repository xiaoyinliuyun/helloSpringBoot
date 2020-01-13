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
@Table(name = "t_idea")
public class TableIdea {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    @NotEmpty(message = "小纸条不能为空")
    @Size(max = 64)
    private String tips;

    private int state;
    private long createTime;
    private long modifyTime;


}
