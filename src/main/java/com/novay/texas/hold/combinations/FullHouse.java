package com.novay.texas.hold.combinations;

import com.novay.texas.hold.PokerHand;

public class FullHouse extends ACombination {

	@Override
	public boolean is(PokerHand pokerHand) {	
		return quantityAndSizeIs(1, 3, pokerHand.getCards()) && quantityAndSizeIs(1, 2, pokerHand.getCards());
	}

}
