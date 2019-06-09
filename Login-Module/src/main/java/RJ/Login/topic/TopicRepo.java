package RJ.Login.topic;

import org.springframework.data.repository.CrudRepository;
//crud add default sql operations string is the type of primay key of the entity topics is the entity class
public interface TopicRepo extends CrudRepository<Topics,String> {
	
	
	

}
