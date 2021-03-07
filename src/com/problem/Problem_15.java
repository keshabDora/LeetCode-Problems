package com.problem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Problem_15 {
	public static List<List<Integer>> threeSum(int[] nums) {

		Set<List<Integer>> set = new HashSet<>();
		if (nums.length == 0)
			return new ArrayList<>(set);

		Arrays.sort(nums);
		for (int i = 0; i < nums.length; i++) {
			int j = i + 1;
			int k = nums.length - 1;
			while (j < k) {
				int sum = nums[i] + nums[j] + nums[k];
				if (sum < 0) {
					j++;
				} else if (sum > 0) {
					k--;
				} else {
					set.add(Arrays.asList(nums[i], nums[j++], nums[k--]));

				}
			} // end while
		} // end for loop

		return new ArrayList<>(set);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = { -1, 0, 1, 2, -1, -4, -2, -3, 3, 0, 4 };
		System.out.println(new Problem_15().threeSum(nums));
	}

}
