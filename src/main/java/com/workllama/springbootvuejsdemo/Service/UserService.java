package com.workllama.springbootvuejsdemo.Service;

import java.util.List;

import com.workllama.springbootvuejsdemo.model.User;

public interface UserService {
	public List<User> findAll();
	public User findById(int theID);
	public void save(User theUser);
	public void deleteById(int theId);
}
