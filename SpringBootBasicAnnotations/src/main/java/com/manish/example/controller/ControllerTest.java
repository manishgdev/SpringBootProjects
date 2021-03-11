package com.manish.example.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerTest {

	@Autowired
	private ServiceTest service;
	
	@RequestMapping("/students")
	public List<String> getStudents() {
		return service.getStudentList();
	}
	
	@RequestMapping("/students-age")
	public HashMap<String, Integer> getStudentAgeMap() {
		return service.getStudentAgeMap();
	}
	
	@RequestMapping("/students-age/{student}")
	public String getStudentAge(@PathVariable String student) {
		return service.getStudentAge(student).toString();
	}
	
	@RequestMapping("/students-state")
	public String getStudentsState() {
		return service.getStudentState();
	}
}
