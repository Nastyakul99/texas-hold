package com.novay.texas.hold.combinations;

import com.novay.texas.hold.PokerHand;

public class TwoPairs extends ACombination{

	@Override
	public boolean is(PokerHand pokerHand) {
		return quantityAndSizeIs(2, 2, pokerHand.getCards());
	}
}
