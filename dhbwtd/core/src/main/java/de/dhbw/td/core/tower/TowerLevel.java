package de.dhbw.td.core.tower;

import playn.core.Image;

class TowerLevel {

	public final int range;
	public final int damage;
	public final int price;
	
	TowerLevel(int range, int damage, int price) {
		this.range = range;
		this.damage = damage;
		this.price = price;
	}
}
