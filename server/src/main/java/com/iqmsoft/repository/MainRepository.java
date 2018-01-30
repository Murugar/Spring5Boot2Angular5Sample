package com.iqmsoft.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.iqmsoft.entity.ToDo;

@Repository
public interface MainRepository extends JpaRepository<ToDo, Long>{

}