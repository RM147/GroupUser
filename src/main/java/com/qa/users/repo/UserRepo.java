package com.qa.users.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.qa.users.entity.Users;

@Repository
public interface UserRepo extends JpaRepository<Users, Long>{
	
}
