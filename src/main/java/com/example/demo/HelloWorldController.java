package com.example.demo;

import com.example.demo.dao.UserRepository;
import com.example.demo.entity.TableUser;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloWorldController {

    private final UserService userService;

    @Autowired
    public HelloWorldController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("/hello")
    public String hello() {
        return "Hello, Spring Boot!";
    }

    @RequestMapping("/findUsers")
    public List<TableUser> findUsers(){
        return userService.findUsers();
    }


}
