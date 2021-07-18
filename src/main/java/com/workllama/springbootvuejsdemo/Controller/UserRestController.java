package com.workllama.springbootvuejsdemo.Controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.CrossOrigin;
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

@CrossOrigin/*(origins= "http://localhost:8081/")*/
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

	//Exposes API to return single user based on userId supplied
	@GetMapping("/users/{userId}")
	public User getUser(@PathVariable String userId )
	{
		User theUser= userService.findByUserId(userId);
		if(theUser==null) {
			throw new UserNotFoundException("User id is not found");
		}
		return theUser;
	}
	
	//Adds new
	@PostMapping("/users")
	public User addUser(@Valid @RequestBody User theUser )
	{
		
		//theUser.setUserId(0);
		userService.save(theUser);
		return theUser;
	}
	
	@PutMapping("/users/{userId}")
	public User updateUser(@Valid @RequestBody User theUser )
	{
		
		userService.save(theUser);
		return theUser;
	}
	
	@DeleteMapping("/users/{userId}")
	public User deleteUser(@PathVariable String userId )
	{
		User theUser= userService.findByUserId(userId);
		if(theUser==null) {
			throw new UserNotFoundException("User id is not found");
		}
		userService.deleteByUserId(userId);
		
		return theUser;
	}
	
	
	@GetMapping("/users/available/{userId}")
	public Boolean checkAvailability(@PathVariable String userId)
	{
		return userService.existsByUserId(userId);
	}
	
	
	@GetMapping("/countries")
		public List<String> getAllCountries()
	{
		return userService.findAllCountries();
	}
	
	
	@GetMapping("/states/{countryName}")
	public List<String> findStatesByCountry(@PathVariable String countryName)
	{
		return userService.findStatesByCountry(countryName);
	}
	
	@GetMapping("/cities/{countryName}/{stateName}")
	public List<String> findCitiesByState(@PathVariable String countryName ,@PathVariable String stateName)
	{
		return userService.findCitiesByState(countryName,stateName);
	}
}