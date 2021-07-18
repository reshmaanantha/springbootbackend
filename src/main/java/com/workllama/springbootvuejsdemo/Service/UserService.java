package com.workllama.springbootvuejsdemo.Service;

import java.util.List;

import com.workllama.springbootvuejsdemo.model.State;
import com.workllama.springbootvuejsdemo.model.User;

public interface UserService {
	
	//Crud operations 
	public List<User> findAll();
	public User findByUserId(String userId);
	public void save(User theUser);
	public void deleteByUserId(String userId);
	public Boolean existsByUserId(String userId);
	
	//Functions for cascading dropdown list
	public List<String> findAllCountries();
	public List<String> findStatesByCountry(String country);
	public List<String> findCitiesByState(String country,String state);
}
