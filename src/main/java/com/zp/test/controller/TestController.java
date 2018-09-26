package com.zp.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.zp.test.service.TestConsumerService;

@Controller
public class TestController {

	@Autowired
	TestConsumerService testConsumerService;
	
	@RequestMapping("test")
	public ModelAndView test() {
		System.out.println(testConsumerService);
		return new ModelAndView("success");
	}
}
