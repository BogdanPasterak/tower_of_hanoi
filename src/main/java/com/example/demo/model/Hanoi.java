package com.example.demo.model;
/**
 * 
 * @author: Bogdan Pasterak
 * @date:   7 Oct 2019
 * @class:  Hanoi
 * 3 towers
 */
public class Hanoi {
	private Tower[] towers;
	
	public Hanoi(int level) {
		towers = new Tower[3];
		towers[0] = new Tower(level);
		towers[1] = new Tower(level);
		towers[2] = new Tower(level);
		towers[0].fill();
	}
	
	@Override
	public String toString() {
		return "Tower 1 " + towers[0].toString() +
				"\nTower 2 " + towers[1].toString() +
				"\nTower 3 " + towers[2].toString();
	}
	
	// recursive method
	// move element to different tower
	public void move(int from, int to, int which) {
		// if is on the top
		if (which == towers[from].getIndexTop() ) {
			towers[from].swap(towers[to]);
			System.out.println("\n"+this.toString());
		}
		// else move one above to third tower
		// swap right one
		// move from third to top
		else {
			int third = 3 - from - to;
			int thirdTop = towers[third].getIndexTop();
			
			move(from, third , which - 1);
			towers[from].swap(towers[to]);
			System.out.println("\n"+this.toString());
			move(third, to, thirdTop - 1);
		}
		
	}

}
