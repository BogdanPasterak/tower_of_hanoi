package com.example.demo.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile({"default","english"})
public class TowerOfHanoiServiceEnglishImpl implements TowerOfHanoiService {

	@Override
	public String say() {
		// TODO Auto-generated method stub
		return "Tower Of Hanoi";
	}

}
