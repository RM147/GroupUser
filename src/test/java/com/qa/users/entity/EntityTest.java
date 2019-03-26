package com.qa.users.entity;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EntityTest {
	
	Users testUser = new Users();
	Users testUser2 = new Users("a","a","a","a","a");

	@Test
	public void forenameTest() {
		testUser.setForename("a");
		assertEquals("a",testUser.getForename());	
	}
	
	@Test
	public void surnameTest() {
		testUser.setLastname("a");
		assertEquals("a",testUser.getLastname());	
	}
	
	@Test
	public void roleTest() {
		testUser.setRole("a");
		assertEquals("a",testUser.getRole());	
	}
	
	@Test
	public void emailTest() {
		testUser.setEmail("a");
		assertEquals("a",testUser.getEmail());	
	}
	
	@Test
	public void passwordTest() {
		testUser.setPassword("a");
		assertEquals("a",testUser.getPassword());	
	}

}
