package com.qa.users.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.qa.users.entity.Users;
import com.qa.users.repo.UserRepo;

@Service
public class UserService implements UserInterface{

	private UserRepo repo;

	public UserService(UserRepo repo) {
		this.repo = repo;
	}

	public Optional<Users> readUser(Long id) {
		return repo.findById(id);
	}

	public String updatePassword(Users user,String password) {
		user.setRole(password);
		return user.getForename() +" " +user.getLastname()+"'s role has beeen changed.";

	}

	public String deleteUser(Users user) {
		String name = user.getForename()+" "+user.getLastname();
		repo.delete(user);
		return name +"has been deleted.";

	}

	public String createUser(Users user) {
		repo.save(user);
		return "Account has been made.";
	}

	public String updateRole(Users user, String role) {
		user.setRole(role);
		return user.getForename() +" " +user.getLastname()+"'s role has beeen changed to " + role+".";
	}

}
