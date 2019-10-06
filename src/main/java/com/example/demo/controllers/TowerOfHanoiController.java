package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.example.demo.services.TowerOfHanoiService;

@Controller
public class TowerOfHanoiController {
	
	private TowerOfHanoiService towerOfHanoiService;
	
	@Autowired
	public void setTowerOfHanoiService(TowerOfHanoiService towerOfHanoiService) {
		this.towerOfHanoiService = towerOfHanoiService;
	}


	public String say() {
		String say = towerOfHanoiService.say();
		System.out.println(say);
		return say;
	}
}
