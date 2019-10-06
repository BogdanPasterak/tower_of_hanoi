package com.example.demo.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("polish")
public class TowerOfHanoiServicePolishImpl implements TowerOfHanoiService {

	@Override
	public String say() {
		// TODO Auto-generated method stub
		return "Wieża Hanoi";
	}

}
