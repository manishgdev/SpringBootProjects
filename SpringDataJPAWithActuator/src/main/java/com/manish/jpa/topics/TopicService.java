package com.manish.jpa.topics;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	@Autowired
	private TopicRepository topicRepo;
	
	public List<Topic> getAllTopics() {	
		List<Topic> topicList = new ArrayList<>();
		topicRepo.findAll().forEach(topicList::add);
		return topicList;
	}
	
	public Topic getTopic(int id) {
		return topicRepo.findById(id).get();
	}

	public void addTopic(Topic topic) {
//		topicList.add(topic);
		topicRepo.save(topic);
	}

	public void updateTopic(Topic topic, int id) {
//		for(int i = 0; i < topicList.size(); i++) {
//			Topic tmp = topicList.get(i);
//			if(tmp.getId() == id) {
//				topicList.set(i, topic);
//				return;
//			}
//		}
		
		topicRepo.save(topic);
	}
	
	public void addAllTopics(List<Topic> topicList) {
		topicRepo.saveAll(topicList);
	}

	public void deleteTopic(int id) {
//		topicList.removeIf(p -> p.getId() == id);
		topicRepo.deleteById(id);
	}
}
