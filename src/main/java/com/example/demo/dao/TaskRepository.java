package com.example.demo.dao;

import com.example.demo.entity.TableTask;
import com.example.demo.entity.Task;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface TaskRepository extends JpaRepository<TableTask, Long> {
    @Query(value = "select * from t_task", nativeQuery = true)
    List<TableTask> findAll();
}
