package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class TowerOfHanoiImpl implements TowerOfHanoiService {
	public void say() {
		System.out.println("Start");
	}
}
