package com.workllama.springbootvuejsdemo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.workllama.springbootvuejsdemo.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
