package com.novay.texas.hold.combinations;

import com.novay.texas.hold.PokerHand;

public class HighCard extends ACombination {

	@Override
	public boolean is(PokerHand pokerHand) {
		return true;
	}

}
