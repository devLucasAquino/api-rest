package com.devlucas.userdept.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devlucas.userdept.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}
