package com.workllama.springbootvuejsdemo.Service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.workllama.springbootvuejsdemo.Repository.CityRepository;
import com.workllama.springbootvuejsdemo.Repository.CountryRepository;
import com.workllama.springbootvuejsdemo.Repository.StateRepository;
import com.workllama.springbootvuejsdemo.Repository.UserRepository;
import com.workllama.springbootvuejsdemo.model.User;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository theUserRepository;
	@Autowired
	private CountryRepository theCountryRepository;
	
	@Autowired
	private StateRepository theStateRepository;
	
	@Autowired
	private CityRepository theCityRepository;
	@Override
	@Transactional
	public List<User> findAll() {
		
		return  theUserRepository.findAll();
	}

	@Override
	@Transactional
	public User findByUserId(String userId) {
		
		Optional<User> result=	theUserRepository.findByUserId(userId);
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
	public void deleteByUserId(String userId) {
		
		theUserRepository.deleteByUserId(userId);

	}

	

	@Override
	@Transactional
	public Boolean existsByUserId(String userId) {
		
		return theUserRepository.existsByUserId(userId);
	}

	
	
	@Override
	public List<String> findAllCountries() {
		// TODO Auto-generated method stub
		return theCountryRepository.findAllCountries();
	}

	@Override
	public List<String> findStatesByCountry(String country) {
		Optional<Long >result =theCountryRepository.findIdByName(country);
	
		Long id;
		if(result.isPresent())
		{
			id=result.get();
			
			List<String> stateNames= theStateRepository.findStatesByCountry(id);
			
			return stateNames;
		}
		else {
			return null;
			
		}
		
	}

	@Override
	public List<String> findCitiesByState(String country,String state)
		 {
		Optional<Long >resultCountry =theCountryRepository.findIdByName(country);
		if(resultCountry.isPresent())
		{
			Long countryId=resultCountry.get() ;
		
		Optional<Long> resultState =theStateRepository.findIdByName(countryId,state);
		
		if(resultState.isPresent())
			{
			Long id=resultState.get();
			List<String> cityNames= theCityRepository.findCitiesByState(id);
			return cityNames;
		}
		
		else {
			return null;
			
		}
		}
		else
			return null;
		
	}

}
