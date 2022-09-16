package com.example.repository;

import com.example.demo.xyz.Students;
import org.springframework.data.repository.CrudRepository;

public interface StudentsRepository extends CrudRepository<Students, Integer> {
}
