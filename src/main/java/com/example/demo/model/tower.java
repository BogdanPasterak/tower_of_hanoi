package com.example.demo.model;
/**
 * 
 * @author: Bogdan Pasterak
 * @date:   7 Oct 2019
 * @class:  tower of Hanoi
 * contains levels with value int
 *
 */
/**
 * 
 * @author: Bogdan Pasterak
 * @date:   7 Oct 2019
 *
 */
public class tower {
	// array of levels
	private int[] levels;
	
	// Constructor
	public tower(int level) {
		levels = new int[level + 1];
	}
	
	// Set sorted blocks
	public void fill() {
		for (int i = 0; i < levels.length; i++) {
			levels[i] = i;
		}
	}

}
