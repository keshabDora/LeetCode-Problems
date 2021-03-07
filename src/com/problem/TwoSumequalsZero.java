package com.problem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TwoSumequalsZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer nums[] = { -1, 0, 1, 2, -1, -4 };
		Arrays.sort(nums);
		int i = 0, j = nums.length-1;
		List<List<Integer>> list=new ArrayList<List<Integer>>();
		while (i < nums.length || j < nums.length) {
			int sum=nums[i]+nums[j];
			if(sum==0) {
				ArrayList<Integer> l=new  ArrayList<Integer>();
				l.add(i);
				l.add(j);
				list.add(l);
				i++;
			}else {
				if(sum<0) {
					i++;	
				}else {
					j++;
				}
			}
			if(i==j) {
				break;
			}
		} // end while
		System.out.println(list.toString());
	}

}
