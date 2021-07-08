package com.workllama.springbootvuejsdemo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.workllama.springbootvuejsdemo.Service.UserService;
import com.workllama.springbootvuejsdemo.model.User;

@RestController
@RequestMapping("/api")
public class UserRestController {

	@Autowired
	private UserService userService;
	
	// expose "/Users" and return list of Users
	@GetMapping("/users")
	public List<User> findAll() {
		return userService.findAll();
	}

	@GetMapping("/users/{userId}")
	public User getUser(@PathVariable int userId )
	{
		User theUser= userService.findById(userId);
		if(theUser==null) {
			throw new UserNotFoundException("User id is not found");
		}
		return theUser;
	}
	
	@PostMapping("/users")
	public User addUser(@RequestBody User theUser )
	{
		
		theUser.setUserId(0);
		userService.save(theUser);
		return theUser;
	}
	
	@PutMapping("/users")
	public User updateUser(@RequestBody User theUser )
	{
		
		userService.save(theUser);
		return theUser;
	}
	@DeleteMapping("/users/{userId}")
	public User deleteUser(@PathVariable int userId )
	{
		User theUser= userService.findById(userId);
		if(theUser==null) {
			throw new UserNotFoundException("User id is not found");
		}
		userService.deleteById(userId);
		
		return theUser;
	}
}