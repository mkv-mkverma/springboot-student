package com.student.school.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.student.school.domain.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Long> {

}
