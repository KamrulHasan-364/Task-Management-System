package com.example.demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.example.demo.model.entity.RoleAgain;
import com.example.demo.repository.Rolerepo;


@SpringBootApplication
//@EnableJpaRepositories(basePackages = "com.example.demo.repository")
//@EntityScan(basePackages = "com.example.demo.repository.entity")
public class TskProjApplication {


	public static void main(String[] args) {
		
	 SpringApplication.run(TskProjApplication.class, args);
		
	
	
		

	}

}
