package com.example.demo.model;

import java.util.Arrays;

/**
 * 
 * @author: Bogdan Pasterak
 * @date:   7 Oct 2019
 * @class:  tower of Hanoi
 * contains levels with value int
 *
 */

public class Tower {
	// array of levels
	private int[] levels;
	
	// Constructor
	public Tower(int level) {
		levels = new int[level + 1];
	}
	
	// Set sorted blocks
	public void fill() {
		for (int i = 0; i < levels.length; i++) {
			levels[i] = i;
		}
	}
	
	@Override
	public String toString() {
		return Arrays.toString(levels);
	}

}
