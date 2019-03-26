package com.qa.users.service;

import java.util.Optional;

import com.qa.users.entity.Users;

public interface UserInterface {
	
	public String createUser(Users user);
	public Optional<Users> readUser(Long id);
	public String updateRole(Users user,String role);
	public String updatePassword(Users user,String password);
	public String deleteUser(Users user);

}
