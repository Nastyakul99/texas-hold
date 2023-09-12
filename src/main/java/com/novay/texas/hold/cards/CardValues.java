package com.novay.texas.hold.cards;

public enum CardValues {
	
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
	
	private Integer rating;
	
	CardValues(int rating){
		this.rating=rating;
	}

	public Integer getRating() {
		return rating;
	}
	
	public static CardValues getValueByStr(String str) {
		for(CardValues cv : CardValues.values()) {
			if(cv.rating<10) {
				if(str.equals(String.valueOf(cv.rating))) return cv;
				continue;
			}
			if (cv.name().startsWith(str)) return cv;
		}
		throw new RuntimeException("value not found");
	}
}
