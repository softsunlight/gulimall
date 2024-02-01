package com.atguigu.gulimall.product;

import com.baomidou.mybatisplus.autoconfigure.DdlApplicationRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class GulimallProductApplication {

	public static void main(String[] args) {
		SpringApplication.run(GulimallProductApplication.class, args);
	}

	@Bean
	public DdlApplicationRunner ddlApplicationRunner(@Autowired(required = false) List ddlList) {
		return new DdlApplicationRunner(ddlList);
	}

}
