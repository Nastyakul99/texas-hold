package com.novay.texas.hold.combinations;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class Combinations {

	private List<ACombination> combinations = new ArrayList<>();
	
	public Combinations add(ACombination combination) {
		combinations.add(combination);
		return this;
	}
	
	public ACombination get(int index) {
		return combinations.get(index);
	}
	
	public int indexOf(ACombination c) {
		return combinations.indexOf(c);
	}
	
	public static Combinations DEFAULT = new Combinations()
			.add(new HighCard())
			.add(new Pair())
			.add(new TwoPairs())
			.add(new ThreeOfKind())
			.add(new Straight())
			.add(new Flush())
			.add(new FullHouse())
			.add(new FourOfKind())
			.add(new StraightFlush());

	public int size() {
		return combinations.size();
	}
	
	public Stream<ACombination> stream() {
		return combinations.stream();
	}
	
	public List<ACombination> reverse() {
		List<ACombination> sub = new ArrayList<>(combinations);
		Collections.reverse(sub);
		return sub;
	}
}
