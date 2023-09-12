package com.novay.texas.hold.combinations;

import java.util.List;
import com.novay.texas.hold.PokerHand;
import com.novay.texas.hold.cards.Card;

public class StraightFlush extends ACombination {

	@Override
	public boolean is(PokerHand pokerHand) {
		List<Card> cards = pokerHand.getCards();
		for(int i=0; i<pokerHand.getCards().size()-1; i++) {
			int diff = cards.get(i+1).getValue().getRating() - cards.get(i).getValue().getRating();
			if(diff != 1 || cards.get(i+1).getSuit() != cards.get(i).getSuit()) return false;
		}
		return true;
	}

}
