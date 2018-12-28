package com.gsb.sundry;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.gsb.sundry.dao")
public class SundryApplication {

	public static void main(String[] args) {
		SpringApplication.run(SundryApplication.class, args);
	}
}
