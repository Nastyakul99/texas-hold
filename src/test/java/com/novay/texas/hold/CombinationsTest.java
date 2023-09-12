package com.novay.texas.hold;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import com.novay.texas.hold.combinations.Flush;
import com.novay.texas.hold.combinations.FourOfKind;
import com.novay.texas.hold.combinations.FullHouse;
import com.novay.texas.hold.combinations.Pair;
import com.novay.texas.hold.combinations.Straight;
import com.novay.texas.hold.combinations.StraightFlush;
import com.novay.texas.hold.combinations.ThreeOfKind;
import com.novay.texas.hold.combinations.TwoPairs;

public class CombinationsTest {

	@Test
	public void flushTest() {
		Assertions.assertTrue(new Flush().is(new PokerHand("2C 3C AC 4C 5C")));
		
		Assertions.assertFalse(new Flush().is(new PokerHand("2C 3C AD 4C 5C")));
	}
	
	@Test
	public void fourOfKindTest() {
		Assertions.assertTrue(new FourOfKind().is(new PokerHand("2C 3C 2S 2H 2D")));
		
		Assertions.assertFalse(new FourOfKind().is(new PokerHand("2C 3C AD 4C 7C")));
	}
	
	@Test
	public void fullHouseTest() {
		Assertions.assertTrue(new FullHouse().is(new PokerHand("2C 3C 3S 2H 2D")));
		
		Assertions.assertFalse(new FullHouse().is(new PokerHand("2C 3C AD 4C 6C")));
	}
	
	@Test
	public void pairTest() {
		Assertions.assertTrue(new Pair().is(new PokerHand("QC 3C QS 5H 2D")));
		
		Assertions.assertFalse(new Pair().is(new PokerHand("2C 3C AD 4C 6C")));
	}
	
	@Test
	public void straightTest() {
		Assertions.assertTrue(new Straight().is(new PokerHand("JC TC 9S 8H 7D")));
		
		Assertions.assertFalse(new Straight().is(new PokerHand("2C 3C AD 4C 6C")));
	}
	
	@Test
	public void straightFlushTest() {
		Assertions.assertTrue(new StraightFlush().is(new PokerHand("JD TD 9D 8D 7D")));
		
		Assertions.assertFalse(new StraightFlush().is(new PokerHand("JC TC 9S 8H 7D")));
	}
	
	@Test
	public void threeOfKindTest() {
		Assertions.assertTrue(new ThreeOfKind().is(new PokerHand("JD TD JC JH 7D")));
		
		Assertions.assertFalse(new ThreeOfKind().is(new PokerHand("JC TC 9S 8H 7D")));
	}
	
	@Test
	public void twoPairsTest() {
		Assertions.assertTrue(new TwoPairs().is(new PokerHand("JD TD JC TH 7D")));
		
		Assertions.assertFalse(new TwoPairs().is(new PokerHand("JC TC 9S 8H 7D")));
	}
	
	@Test
	public void sortedTest() {
		PokerHand highCard = new PokerHand("2H 4C 5D 6C 7S");
		PokerHand flush = new PokerHand("2C 3C AC 4C 5C");
		PokerHand fourOfKind = new PokerHand("2C 3C 2S 2H 2D");
		PokerHand fullHouse = new PokerHand("2C 3C 3S 2H 2D");
		PokerHand pair = new PokerHand("QC 3C QS 5H 2D");
		PokerHand straight = new PokerHand("JC TC 9S 8H 7D");
		PokerHand straightFlush = new PokerHand("JD TD 9D 8D 7D");
		PokerHand threeOfKind = new PokerHand("JD TD JC JH 7D");
		PokerHand twoPairs = new PokerHand("JD TD JC TH 7D");
		
		List<PokerHand> testList = Arrays.asList(
				flush,
				fourOfKind,
				fullHouse,
				highCard,
				pair,
				straight,
				straightFlush,
				threeOfKind,
				twoPairs
				);
		
		Collections.sort(testList);
		
		List<PokerHand> modelList = Arrays.asList(
				highCard,
				pair,
				twoPairs,
				threeOfKind,
				straight,
				flush,
				fullHouse,
				fourOfKind,
				straightFlush
				);
			
		Assertions.assertEquals(testList, modelList);
	}
}
