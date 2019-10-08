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

	public int getIndexTop() {
		for (int i = 1; i < levels.length; i++) {
			if (levels[i] > 0)
				return i;
		}
		return levels.length;
	}

	public void swap(Tower tower) {
		
		int indexFrom = this.getIndexTop();
		int indexTo = tower.getIndexTop();
		
		tower.setElement(indexTo - 1, this.getElement(indexFrom));
		this.setElement(indexFrom, 0);
	}

	public int getElement(int index) {
		return levels[index];
	}

	public void setElement(int index, int element) {
		levels[index] = element;
	}

}
