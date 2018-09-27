package com.zp.test.dao;

import java.util.List;

import com.zp.test.bean.User;

public interface UserDao {

	int insert(User record);
	
	int update(User user);
	
	List<User> queryAll();
	
	User queryById(int Id);
}
