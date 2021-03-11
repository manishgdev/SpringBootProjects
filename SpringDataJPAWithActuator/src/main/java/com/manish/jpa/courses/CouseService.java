package com.manish.jpa.courses;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CouseService {
	
	@Autowired
	private CourseRepository courseRepo;
	
	public List<Course> getAllCourses(int id) {	
		List<Course> couseList = new ArrayList<>();
		courseRepo.findByTopicId(id).forEach(couseList::add);
		return couseList;
	}
	
	public Course getCouse(int id) {
		return courseRepo.findById(id).get();
	}

	public void addCourse(Course course) {
//		topicList.add(topic);
		courseRepo.save(course);
	}

	public void updateCourse(Course course) {
//		for(int i = 0; i < topicList.size(); i++) {
//			Topic tmp = topicList.get(i);
//			if(tmp.getId() == id) {
//				topicList.set(i, topic);
//				return;
//			}
//		}
		courseRepo.save(course);
	}
	
	public void addAllCourses(List<Course> courseList) {
		courseRepo.saveAll(courseList);
	}

	public void deleteCourse(int id) {
//		topicList.removeIf(p -> p.getId() == id);
		courseRepo.deleteById(id);
	}
}
