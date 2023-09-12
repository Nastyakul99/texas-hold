package com.novay.texas.hold;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import com.novay.texas.hold.cards.Card;
import com.novay.texas.hold.cards.CardValues;
import com.novay.texas.hold.cards.Suits;
import com.novay.texas.hold.combinations.ACombination;
import com.novay.texas.hold.combinations.Combinations;

public class PokerHand implements Comparable<PokerHand>  {
	
	private Combinations combinations = Combinations.DEFAULT;

	private List<Card> cards = new ArrayList<Card>(5);
	
	private final Integer raiting;
	
	private final String text;

	public PokerHand(String cardsStr) {
		this.text = cardsStr;
		cards = toCards(cardsStr);
		Collections.sort(cards);
		raiting = calcRaiting();
	}
	
	private List<Card> toCards(String cardsStr){
		return Arrays
		.stream(cardsStr.split(" "))
		.map(c->toCard(c))
		.collect(Collectors.toList());
	}
	
	private Card toCard(String cardStr){
		CardValues value = CardValues.getValueByStr(cardStr.substring(0, 1));
		Suits suit = Suits.getSuitByStr(cardStr.substring(1, 2));
		return new Card(value, suit);
	}

	public List<Card> getCards() {
		return cards;
	}
	
	private int calcRaiting() {		
		for(ACombination combination : combinations.reverse()) {
			if(combination.is(this)) return combinations.indexOf(combination);	
		}
		return 0;
	}

	@Override
	public int compareTo(PokerHand o) {
		return this.raiting.compareTo(o.raiting);
	}

	public void setCombinations(Combinations combinations) {
		this.combinations = combinations;
	}
	
	public Integer getRaiting() {
		return raiting;
	}
	
	@Override
	public String toString() {
		return text;
	}
}
