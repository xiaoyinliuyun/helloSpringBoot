package com.example.demo;

import com.example.demo.dao.UserRepository;
import com.example.demo.entity.TableUser;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
public class UserControllerByJPATest {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void assembleFindAll() {
        List<TableUser> allUser = userRepository.findAll();
        for (TableUser user : allUser) {
            System.out.println(user);
        }
    }
}
