package com.zp.test.service;

import java.util.List;

import com.zp.test.bean.User;

public interface UserService {

	int createUser();
	
	List<User> queryUser();
	
	User queryById(int Id);
	
	int updateUser(User user);
}
