package com.workllama.springbootvuejsdemo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.workllama.springbootvuejsdemo.model.City;

public interface CityRepository extends JpaRepository<City, Long> {

	@Query("select c.name from City c where c.state.id=:id")
	public List<String> findCitiesByState (@Param("id")long id);
}
