package com.zp.test.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zp.test.bean.User;
import com.zp.test.dao.UserDao;
import com.zp.test.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDao userDao;
	
	public int createUser() {
		User user = new User();
		user.setAge(12);
		user.setUserName("zp");
		user.setPassword("123456");
		return userDao.insert(user);
	}

	public List<User> queryUser() {
		return userDao.queryAll();
	}

	public User queryById(int Id) {
		return userDao.queryById(Id);
		
	}

	public int updateUser(User user) {
		return userDao.update(user);
	}

}
