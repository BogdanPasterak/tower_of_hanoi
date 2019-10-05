package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class InjectedByConstructorService {
	private TowerOfHanoiService towerOfHanoiService;
	
	@Autowired
	public InjectedByConstructorService(TowerOfHanoiService towerOfHanoiService) {
		this.towerOfHanoiService = towerOfHanoiService;
	}

	public void getMessage() {
		towerOfHanoiService.say();		
	}
}
