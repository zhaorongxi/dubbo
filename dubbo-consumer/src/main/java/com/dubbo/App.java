package com.dubbo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dubbo.service.DemoService;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) throws Exception {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "spring/applicationContext-dubbo.xml" });
		context.start();

		DemoService demoService = (DemoService) context.getBean("demoService"); // 获取远程服务代理
		String st = demoService.sayHello("zhaorongxi"); // 执行远程方法

		System.out.println(st); // 显示调用结果
	}
}
