package com.example.demo.service;

import com.example.demo.dao.UserRepository;
import com.example.demo.entity.TableUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<TableUser> findUsers(){
        return userRepository.findAll();
    }
}
