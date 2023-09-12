package com.novay.texas.hold.combinations;

import com.novay.texas.hold.PokerHand;

public class ThreeOfKind extends ACombination {

	@Override
	public boolean is(PokerHand pokerHand) {
		return quantityAndSizeIs(1, 3, pokerHand.getCards());
	}
}
