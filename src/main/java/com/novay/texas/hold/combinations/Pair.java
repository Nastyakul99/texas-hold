package com.novay.texas.hold.combinations;

import com.novay.texas.hold.PokerHand;

public class Pair extends ACombination {

	@Override
	public boolean is(PokerHand pokerHand) {
		return quantityAndSizeIs(1, 2, pokerHand.getCards());
	}

}
