package com.asp.testit.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.asp.testit.Entity.User;

@Repository
public interface UserRepo extends JpaRepository<User, Integer> {
	
}
