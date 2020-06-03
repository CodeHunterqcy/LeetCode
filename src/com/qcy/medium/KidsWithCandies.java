package com.qcy.medium;

import java.util.ArrayList;
import java.util.List;

public class KidsWithCandies {
	public static void main(String[] args) {

	}

	public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
		int max = 0;
		for (int i = 0; i < candies.length; i++) {
			if (candies[i] > max) {
				max = candies[i];
			}
		}
		List<Boolean> res = new ArrayList<Boolean>();
		for (int i = 0; i < candies.length; i++) {
			if (candies[i] + extraCandies >= max) {
				res.add(true);
			} else {
				res.add(false);
			}
		}
		return res;

	}
}
