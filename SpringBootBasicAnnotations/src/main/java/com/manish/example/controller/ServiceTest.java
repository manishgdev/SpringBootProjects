package com.manish.example.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manish.example.test.Students;

@Service
public class ServiceTest {
	
	@Autowired
	public Students students;
	
	public List<String> getStudentList() {
		return new ArrayList<>(Arrays.asList(students.getStudentsArr()));
	}
	
	public HashMap<String, Integer> getStudentAgeMap() {
		return students.getStudentAgeMap();
	}

	public String getStudentState() {
		return students.getState();
	}

	public Integer getStudentAge(String student) {
		return students.getStudentAgeMap().get(student);
	}
	
}
