package com.string;

import java.util.List;

/*
 * 1773. Count Items Matching a Rule
 * 
 * 	Input: items = [["phone","blue","pixel"],["computer","silver","lenovo"],["phone","gold","iphone"]], ruleKey = "color", ruleValue = "silver"
	Output: 1
	Explanation: There is only one item matching the given rule, which is ["computer","silver","lenovo"].
 */
public class Problem_1773 {

	public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
		int k = 0;
		if (ruleKey.equals("color")) {
			k = 1;
		} else if (ruleKey.equals("name")) {
			k = 2;
		}
		int result = 0;

		for (List<String> ss : items) {
			if (ss.get(k).equals(ruleValue))
				result++;
		}
		return result;
	}

}
