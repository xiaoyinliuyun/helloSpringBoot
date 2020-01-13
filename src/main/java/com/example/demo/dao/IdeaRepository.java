package com.example.demo.dao;

import com.example.demo.entity.Idea;
import com.example.demo.entity.TableIdea;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface IdeaRepository extends JpaRepository<TableIdea, Long> {

    @Query(value = "select * from t_idea", nativeQuery = true)
    List<TableIdea> findAll();
}
