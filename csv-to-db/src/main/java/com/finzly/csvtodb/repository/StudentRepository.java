package com.finzly.csvtodb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.finzly.csvtodb.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
