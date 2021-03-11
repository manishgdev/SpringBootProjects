package com.manish.jpa.courses;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course, Integer>{

	public List<Course> findByName(String name);
	public List<Course> findByTopicId(int id);
}
