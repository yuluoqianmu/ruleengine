package com.yixin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@MapperScan("com.yixin")
@SpringBootApplication
public class RuleengineApplication {

	public static void main(String[] args) {
		SpringApplication.run(RuleengineApplication.class, args);
	}
}
