package com.icsc.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.icsc.demo.service.MyService;

@RestController
@RequestMapping(value = "/rest/api/my")
public class MyController {
	
	@Autowired
	private MyService svc;
	
	@GetMapping(path = "/test") 
	public String test() throws Exception{
		return svc.test();
	}

}
