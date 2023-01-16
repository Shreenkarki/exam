package com.example.exam.repository;

import com.example.exam.entity.StudentEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepoStudent extends CrudRepository<StudentEntity,Integer> {

}
