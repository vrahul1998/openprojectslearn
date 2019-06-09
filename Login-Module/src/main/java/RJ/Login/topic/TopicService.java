package RJ.Login.topic;

import java.util.ArrayList;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {
	@Autowired
	private TopicRepo topicRepo;

	public List<Topics>getAllTopics(){
		List<Topics> topics = new ArrayList<>();
		topicRepo.findAll().forEach(topics::add);
		return topics;
		 
	}
	public Topics getTopic(String id) {
	
		//return 	topics.stream().filter(t->t.getId().equals(id)).findFirst().get();
		return topicRepo.findOne(id);
	}
	public void addTopic(Topics topic) {
		// TODO Auto-generated method stub
		topicRepo.save(topic);
		
		
	}
	public void updateTopic(String id, Topics topic) {
		// TODO Auto-generated method stub
		topicRepo.save(topic);	
	}
	public void deleteTopic(String id) {
		// TODO Auto-generated method stub
		//topics.removeIf(t->t.getId().equals(id));
		topicRepo.delete(id);
	}
	
}
