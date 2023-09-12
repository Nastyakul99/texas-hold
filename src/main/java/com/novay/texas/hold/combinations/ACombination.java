package com.novay.texas.hold.combinations;

import java.util.List;
import com.novay.texas.hold.PokerHand;
import com.novay.texas.hold.cards.Card;

public abstract class ACombination {

	public abstract boolean is(PokerHand pokerHand);
	
	public boolean quantityAndSizeIs(Integer quantity, Integer size, List<Card> cards) {
		Integer q = 0;
		
		for(List<Card> i : Card.getGroups(cards).values()) {
			if(i.size()==size) q++;
		}
		return q.equals(quantity);
	}
}
