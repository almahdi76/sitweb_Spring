package com.masite.siteweb.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/student")
public class StudentController {
	
	private final StudentService studentService;
	
@Autowired
public StudentController(StudentService studentService) {
		
		//this.studentService = new StudentService();
	this.studentService =  studentService;
	}


//	@GetMapping
//	public List<Student> getStudent() {
//		return List.of(
//				new Student(
//				1L,
//				"almahdi",
//				"mad@gmail.com",
//				LocalDate.of(2021,Month.AUGUST,5),
//				45
//				)
//				);
//	}
	
	@GetMapping
	public List<Student> getStudents() {
		return studentService.getStudents();
	
	}

}
