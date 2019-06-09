package RJ.Login.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	private List<Topics> topics=new ArrayList<>(Arrays.asList(
			new Topics("spr1ing","1framework","despription1"),
			new Topics("spr2ing","2framework","despription2"),
			new Topics("spr3ing","3framework","despription3")
			));
	
	public List<Topics>getAllTopics(){
		return topics;
	}
	public Topics getTopic(String id) {
	return 	topics.stream().filter(t->t.getId().equals(id)).findFirst().get();
	}
	public void addTopic(Topics topic) {
		// TODO Auto-generated method stub
		topics.add(topic);
		
	}
	public void updateTopic(String id, Topics topic) {
		// TODO Auto-generated method stub
		for(int i=0;i<topics.size();i++) {
			Topics t=topics.get(i);
			if(t.getId().equals(id)) {
				topics.set(i,topic);
				return;
			}
		}
			
		
	}
	public void deleteTopic(String id) {
		// TODO Auto-generated method stub
		topics.removeIf(t->t.getId().equals(id));
		
	}
	
}
