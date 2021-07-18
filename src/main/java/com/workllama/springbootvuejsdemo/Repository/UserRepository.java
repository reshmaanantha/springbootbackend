package com.workllama.springbootvuejsdemo.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.workllama.springbootvuejsdemo.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

	Optional<User> findByUserId(String userId);
	void deleteByUserId(String userId);
	Boolean existsByUserId(String userId);


}
