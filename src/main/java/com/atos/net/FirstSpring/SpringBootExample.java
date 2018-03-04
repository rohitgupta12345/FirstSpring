package com.atos.net.FirstSpring;
import org.springframework.boot.SpringApplication;  
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.atos.controller.Login; 

@SpringBootApplication
@ComponentScan(basePackageClasses=Login.class)
public class SpringBootExample {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  SpringApplication.run(SpringBootExample.class, args); 

	}

}
