package com.masite.siteweb.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.stereotype.Service;

@Service      //Component
public class StudentService {
	public List<Student> getStudents() {
		return List.of(
				new Student(
				1L,
				"almahdi",
				"almad@gmail.com",
				LocalDate.of(2021,Month.AUGUST,5),
				45
				)
				);
	}


}
