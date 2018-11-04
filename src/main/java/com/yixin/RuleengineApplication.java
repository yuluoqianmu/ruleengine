package com.yixin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import tk.mybatis.spring.annotation.MapperScan;

@EnableAutoConfiguration
@MapperScan("com.yixin.mapper")
@SpringBootApplication
public class RuleengineApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(RuleengineApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(RuleengineApplication.class);
	}

}
