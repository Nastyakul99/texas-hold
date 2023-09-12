package com.novay.texas.hold.cards;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class Card implements Comparable<Card>{

	private final Suits suit;
	
	private final CardValues value;
	
	public Card(CardValues value, Suits suit) {
		this.suit = suit;
		this.value = value;
	}

	public Suits getSuit() {
		return suit;
	}

	public CardValues getValue() {
		return value;
	}

	@Override
	public int hashCode() {
		return Objects.hash(suit, value);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Card other = (Card) obj;
		return suit == other.suit && value == other.value;
	}

	@Override
	public String toString() {
		return "Card [suit=" + suit + ", value=" + value + "]";
	}

	@Override
	public int compareTo(Card o) {
		return this.getValue().getRating().compareTo(o.getValue().getRating());
	}
	
	public static Map<CardValues, List<Card>> getGroups(List<Card> cards){
		return cards.stream()
			       .collect(Collectors.groupingBy(Card::getValue));
	} 
}
