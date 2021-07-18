package com.workllama.springbootvuejsdemo.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.workllama.springbootvuejsdemo.model.Country;
import com.workllama.springbootvuejsdemo.model.State;
import com.workllama.springbootvuejsdemo.model.User;

@Repository
public interface CountryRepository extends CrudRepository<Country, Long> {

	@Query("select c.name from Country c ")
	public List<String> findAllCountries();
	
	@Query("select c.id from Country c where c.name=:countryName")
	public Optional<Long > findIdByName(@Param("countryName")String countryName);

	
}