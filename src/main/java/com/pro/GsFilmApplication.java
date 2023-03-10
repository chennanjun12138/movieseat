package com.pro;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.pro.dao")
public class GsFilmApplication {

	public static void main(String[] args) {
		SpringApplication.run(GsFilmApplication.class, args);
	}

}
