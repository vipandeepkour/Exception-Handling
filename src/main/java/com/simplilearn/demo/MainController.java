package com.simplilearn.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
	@GetMapping("/hello")
public ResponseEntity<Object> getResult(){//i want to send the response.returns the<object >of any type
	return new ResponseEntity<Object>("Request Responded",HttpStatus.OK);
}
	@PostMapping("/user")
	public ResponseEntity<User> getUser(){//returns the object of type user
		User u= new User(1,"Sheldon");//user object u created
		return new ResponseEntity<User>	(u,HttpStatus.CREATED);
	}
	@GetMapping("/product/{id}")
public ResponseEntity<Object>getproduct(@PathVariable("id")int id) throws ProductNotFoundException{
	if(id==0)
		throw new ProductNotFoundException("Invalid Id");		//if(id==0)
	else 														//return new ResponseEntity <Object>("Product not found",HttpStatus.NOT_FOUND);
		return new ResponseEntity<Object>("Product found",HttpStatus.FOUND);														//else 
																//return new ResponseEntity<Object>("Product found",HttpStatus.FOUND);
	}
}
//to handle such problems we use Exception handler 