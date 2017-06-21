package com.student.school.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.school.domain.Student;
import com.student.school.repository.StudentRepo;

@Service
public class StudentService {

	@Autowired
	StudentRepo studentRepo;
	
	public List<Student> getAllStudents (){
		return studentRepo.findAll();
	}
	
}
