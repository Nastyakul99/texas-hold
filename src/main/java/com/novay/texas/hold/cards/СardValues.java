package com.novay.texas.hold.cards;

public enum ÑardValues {
	
	ONE(1),
	TWO(2),
	THREE(3),
	FOUR(4),
	FIVE(5),
	SIX(6),
	SEVEN(7),
	EIGHT(8),
	NINE(9),
	TEN(10),
	JACK(11),
	QUEEN(12),
	KING(13),
	ACE(14);
	
	private int rating;
	
	ÑardValues(int rating){
		this.rating=rating;
	}

	public int getRating() {
		return rating;
	}
}
