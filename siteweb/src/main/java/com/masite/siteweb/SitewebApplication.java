package com.masite.siteweb;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.masite.siteweb.student.Student;

@SpringBootApplication
//@RestController
public class SitewebApplication {

	public static void main(String[] args) {
		SpringApplication.run(SitewebApplication.class, args);
	}
	
//	@GetMapping
//	public String hello() {
//		return "bienvenue";
//	}
//	
//	@GetMapping
//	public List<String> hello() {
//		return List.of("Hello","world");
//	}
//	@GetMapping
//	public List<Student> hello() {
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

}
