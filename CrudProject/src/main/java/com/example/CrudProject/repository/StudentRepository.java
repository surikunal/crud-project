package com.example.CrudProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.CrudProject.domain.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}
