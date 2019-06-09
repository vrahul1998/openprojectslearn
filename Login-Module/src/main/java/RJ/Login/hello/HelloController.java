package RJ.Login.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


//to return a jsan to a response
 
@RestController
public class HelloController {
	// to respond when page is redirected to /hello
	@RequestMapping("/hello")
	public String sayHi() {
		return "hi";
	}

	

}
