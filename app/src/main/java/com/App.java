package com;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class App {
	@Autowired
	private BasicDataSource dataSource;

	public static void main(String[] args) {
		new SpringApplicationBuilder(App.class).run(args);
	}

}
