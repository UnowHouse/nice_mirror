package com.zhu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;




@SpringBootApplication
@MapperScan("com.zhu.dao")
public class NicemirrorApplication {
	public static void main(String[] args) {
		SpringApplication.run(NicemirrorApplication.class, args);
	}
}
