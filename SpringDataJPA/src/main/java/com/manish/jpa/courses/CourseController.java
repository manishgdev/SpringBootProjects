package com.manish.jpa.courses;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.manish.jpa.topics.Topic;

@RestController
public class CourseController {

	@Autowired
	private CouseService courseService;

	@RequestMapping("/topics/{topicId}/courses")
	public List<Course> getAllCourses(@PathVariable int topicId) {
		return courseService.getAllCourses(topicId);
	}

	@RequestMapping("/topics/{topicId}/courses/{courseId}")
	public Course getTopic(@PathVariable int id) {
		return courseService.getCouse(id);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/topics/{topicId}/courses")
	public void addCourse(@RequestBody Course course, @PathVariable int topicId) {
		course.setTopic(new Topic(topicId, "", ""));
		courseService.addCourse(course);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/topics/{topicId}/add-all-courses")
	public void addAllCourses(@RequestBody List<Course> courseList, @PathVariable int topicId) {
		courseList.forEach(c -> c.setTopic(new Topic(topicId, "", "")));
		courseService.addAllCourses(courseList);
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/topics/{topicId}/courses/{courseId}")
	public void updateCourse(@RequestBody Course course, @PathVariable int topicId, @PathVariable int courseId) {
		course.setTopic(new Topic(topicId, "", ""));
		courseService.updateCourse(course);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/topics/{topicId}/courses/{courseId}")
	public void deleteCourse(@PathVariable int id) {
		courseService.deleteCourse(id);
	}
}
