package com.wangzhen.spbspringdatajpa.repository;

import com.wangzhen.spbspringdatajpa.bean.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student,Integer> {

    Student findByName(String name);

    List<Student> findByNameAndAddress(String name, String address);

    List<Student> findByNameLike(String name);
}
