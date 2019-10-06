package com.example.demo;

//import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.controllers.TowerOfHanoiController;

@SpringBootApplication
public class TowerOfHanoiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(TowerOfHanoiApplication.class, args);
		//InjectedByConstructorService constructorService = (InjectedByConstructorService) ctx.getBean("injectedByConstructorService");
		//constructorService.getMessage();
		
		TowerOfHanoiController controller = (TowerOfHanoiController) ctx.getBean("towerOfHanoiController");
		controller.say();

	}

}
