package com.dubbo.service.impl;

import com.dubbo.service.DemoService;

public class DemoServiceImpl implements DemoService{

	public String sayHello(String name) {
		return "hello"+name;
	}

}
