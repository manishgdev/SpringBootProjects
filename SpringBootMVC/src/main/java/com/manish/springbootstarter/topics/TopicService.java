package com.manish.springbootstarter.topics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	List<Topic> topicList = new ArrayList<>(Arrays.asList(
			new Topic(1, "Spring Framework", "Spring Framework Description"),
			new Topic(2, "Core Java", "Core Java Description"),
			new Topic(3, "Javaascript", "Javascript Description")
		));
	
	public List<Topic> getAllTopics() {
		return topicList;
	}
	
	public Topic getTopic(int id) {
		Topic topic = topicList.stream().filter(t -> t.getId() == id).findFirst().get();
		return topic;
	}

	public void addTopic(Topic topic) {
		topicList.add(topic);
	}

	public void updateTopic(Topic topic, int id) {
		for(int i = 0; i < topicList.size(); i++) {
			Topic tmp = topicList.get(i);
			if(tmp.getId() == id) {
				topicList.set(i, topic);
				return;
			}
		}
	}

	public void deleteTopic(int id) {
		topicList.removeIf(p -> p.getId() == id);
	}
}
