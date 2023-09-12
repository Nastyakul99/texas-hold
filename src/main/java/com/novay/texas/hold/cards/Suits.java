package com.novay.texas.hold.cards;

public enum Suits {
	
	SPADES,
	
	HEARTS,
	
	DIAMONDS,
	
	CLUBS;
	
	public static Suits getSuitByStr(String str) {
		for(Suits s : Suits.values()) {
			if (s.name().startsWith(str)) return s;
		}
		throw new RuntimeException("Suit not found");
	}
}
