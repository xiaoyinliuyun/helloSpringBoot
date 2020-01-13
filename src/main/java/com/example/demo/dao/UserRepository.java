package com.example.demo.dao;

import com.example.demo.entity.TableUser;
import com.example.demo.entity.User;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<TableUser,Long> {
    @Query(value = "select * from t_user_test ",nativeQuery = true)
    List<TableUser> findAll();
}
