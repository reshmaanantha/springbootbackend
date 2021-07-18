package com.workllama.springbootvuejsdemo.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.workllama.springbootvuejsdemo.model.State;

public interface StateRepository extends JpaRepository<State, Long> {

	
	@Query("select s.name from State s where s.country.id=:id")
	public List<String> findStatesByCountry(@Param("id")long id);
	
	@Query("select s.id from State s where s.name=:stateName and s.country.id=:countryId")
	public Optional<Long > findIdByName(@Param("countryId")Long countryId, @Param("stateName")String stateName);

	
}
