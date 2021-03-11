package com.manish.example.test;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:values.properties")
public class Students {
	
	@Value("${students.List}")
	private String[] studentsArr;
	
	@Value("#{${students.ageMap}}")
	private HashMap<String, Integer> studentAgeMap;
	
	@Value("#{${students.unknownMap : {Piyush: '32'}}}")
	private HashMap<String, Integer> unknownMap;
	
	@Value("${students.state:No State}")
	private String state;
	
	public String[] getStudentsArr() {
		return studentsArr;
	}

	public HashMap<String, Integer> getStudentAgeMap() {
		return studentAgeMap;
	}
	
	public String getState() {
		return state;
	}
}
