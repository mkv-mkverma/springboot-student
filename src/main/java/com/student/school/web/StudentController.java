package com.student.school.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student.school.domain.Student;
import com.student.school.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	StudentService studentService;
	
	
	@GetMapping(name="/getStudents")
	ResponseEntity<List<Student>> getAllStudents (){
		
		List<Student> studentList = null;
		studentList = studentService.getAllStudents();
		return new ResponseEntity<List<Student>>(studentList,HttpStatus.OK);
		
	}

}
