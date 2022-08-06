package com.blzasg.RestController.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.blzasg.RestController.dto.User;

@RestController

@RequestMapping("/hello")
public class RestControllerController {
//////////////  Uc 1  ////////////
	// curl http://localhost:8080/hello -w "\n"
	// Hello From BridgeLabz..!!

	@GetMapping("")
	public String getrequest() {
		return "Hello From BridgeLabz..!!";
	}
	
//////////////  Uc 2  ////////////	
	//curl http://localhost:8080/hello/query?firstName=Piyush
	//Hello Piyush From BridgeLabz

	@GetMapping("/query")
	public String showNameWithQuery(@RequestParam String firstName) {
		return " Hello "+ firstName +" From BridgeLabz";
	}
	
//////////////  Uc 3  ////////////	
	//curl http://localhost:8080/hello/param/Piyush -w "\n"
	//Hello Piyush From BridgeLabz

	@GetMapping("/param/{name}")
	public String showNameWithPathVariable(@PathVariable String name) {
	return " Hello "+name+" From BridgeLabz";
	}
	
//////////////  Uc 4  ////////////
	// curl -X POSt -H "contrnt-Type: application/json" -d 
	//'{"firstName:"Piyush","lastName:"Patil"}' 
	//"http://localhost:8080/hello/post"
	//Hello Piyush Patil From BridgeLabz

	@PostMapping("/post")
	public String showDetail(@RequestBody User user) {
		return "Hello "+ user.getFirstName()+" "+ user.getLastName()+" From BridgeLabz";
	}
	
//////////////  Uc 5  ////////////
	// curl -X PUT localhost:8080/hello/put/Piyush/?lastName=Patil -w "\n" 
	// Hello Piyush Patil Fromm BridgeLabz

	@PutMapping("/put/{firstName}")
	public String puts(@PathVariable String firstName , @RequestParam String lastName) {
		
		return "Hello "+ firstName +" "+ lastName + " Fromm BridgeLabz";
		
	}
}
