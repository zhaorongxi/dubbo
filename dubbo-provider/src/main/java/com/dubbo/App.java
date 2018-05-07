package com.dubbo;

import org.apache.log4j.PropertyConfigurator;

/**
 * Hello world!
 *
 */
public class App {
	static {
		PropertyConfigurator.configure("src/main/resources/log4j.properties");
	}

	public static void main(String[] args) {

		com.alibaba.dubbo.container.Main.main(args);
	}
}
