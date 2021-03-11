package com.manish.springbootstarter.topics;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {

	@RequestMapping("/topics")
	public List<Topic> getAllTopics() {
		
		
		return Arrays.asList(
					new Topic(1, "Spring Framework", "Spring Framework Description"),
					new Topic(2, "Core Java", "Core Java Description"),
					new Topic(3, "Javaascript", "Javascript Description")
				);
	}
}
