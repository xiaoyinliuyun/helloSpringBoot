package com.example.demo;

import com.example.demo.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
public class UserControllerTest {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Test
    public void createUserTable() throws Exception {
        String sql = "create table t_user_test\n" +
                "(\n" +
                "id int auto_increment,\n" +
                " name varchar(20) not null,\n" +
                " nickname varchar(20) not null,\n" +
                " password varchar(20) not null,\n" +
                " mobile varchar(11) null,\n" +
                " level int default 0 not null,\n" +
                " create_time timestamp default CURRENT_TIMESTAMP not null,\n" +
                " modify_time timestamp default CURRENT_TIMESTAMP not null,\n" +
                " is_deleted int default 0 not null,\n" +
                "\n" +
                "unique(name,mobile),\n" +
                "\n" +
                "constraint t_user_pk\n" +
                "\n" +
                "primary key(id)\n" +
                ");\n" +
                "\n";
        jdbcTemplate.execute(sql);
    }

    @Test
    public void saveUserTest() {
        String sql = "insert into t_user_test (name,nickname,password,mobile) values ('刘德华','FilmGod','123456','15210631890' )";
        int rows = jdbcTemplate.update(sql);
        System.out.println(rows);
    }

    @Test
    public void getUserByName() {
        String name = "zhangxueyou";
        String sql = "select * from t_user_test where name = ?";
        List<User> list = jdbcTemplate.query(sql, new User(), new Object[]{name});
        for (User user : list) {
            System.out.println(user.getMobile());
        }
    }

//    @Test
//    public void list() {
//        String sql = "select * from t_user_test";
//        List<User> userList = jdbcTemplate.query(sql, new BeanPropertyRowMapper(User.class));
//        for (User user : userList) {
//            System.out.println(user.getName());
//        }
//    }

    @Test
    public void updateUserPassword() {
        String name = "zhangxueyou";
        String password = "654321";
        String sql = "update t_user_test set password = ? where name = ?";
        int rows = jdbcTemplate.update(sql, password, name);
        System.out.println(rows);
    }

    @Test
    public void deleteUserById() {
        String sql = "delete from t_user_test where id = ?";
        int rows = jdbcTemplate.update(sql, 3);
        System.out.println(rows);
    }
}
