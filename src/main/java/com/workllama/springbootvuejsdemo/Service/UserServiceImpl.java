package com.workllama.springbootvuejsdemo.Service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.workllama.springbootvuejsdemo.Repository.UserRepository;
import com.workllama.springbootvuejsdemo.model.User;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository theUserRepository;
	@Override
	@Transactional
	public List<User> findAll() {
		
		return  theUserRepository.findAll();
	}

	@Override
	@Transactional
	public User findById(int theID) {
		
		Optional<User> result=	theUserRepository.findById(theID);
		User theUser=null;
		if(result.isPresent())
		{
			theUser=result.get();
			
		}
		else {
			return null;
			
		}
		return(theUser);
	}

	@Override
	@Transactional
	public void save(User theUser) {
		theUserRepository.save(theUser);

	}

	@Override
	@Transactional
	public void deleteById(int theId) {
		
		theUserRepository.deleteById(theId);

	}

}
