package com.zp.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.zp.test.service.TestConsumerService;
import com.zp.test.service.UserService;

@Controller
public class TestController {

	@Autowired
	TestConsumerService testConsumerService;
	
	@Autowired
	UserService userService;
	
	@RequestMapping("test")
	public ModelAndView test() {
		System.out.println(testConsumerService);
		return new ModelAndView("success");
	}
	
	@RequestMapping("insert")
	public ModelAndView insert() {
		System.out.println(userService.createUser());
		return new ModelAndView("success");
	}
	
	@RequestMapping("queryById")
	public ModelAndView queryById(String id) {
		int uid = Integer.parseInt(id);
		System.out.println(userService.queryById(uid));
		return new ModelAndView("success");
	}
	
	@RequestMapping("queryAll")
	public ModelAndView queryAll() {
		System.out.println(userService.queryUser());
		return new ModelAndView("success");
	}
}
