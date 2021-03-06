package com.string;

/*
 1108. Defanging an IP Address
 
Given a valid (IPv4) IP address, return a defanged version of that IP address.
A defanged IP address replaces every period "." with "[.]".

 Example 1:

Input: address = "1.1.1.1"
Output: "1[.]1[.]1[.]1"
Example 2:

Input: address = "255.100.50.0"
Output: "255[.]100[.]50[.]0"
 */
public class Problem_1108 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String address = "255.100.50.0";
		StringBuffer result = new StringBuffer();
		for (int i = 0; i < address.length(); i++) {
			result.append(address.charAt(i)=='.'?"[.]":address.charAt(i));
		} // end for loop
		System.out.println(result.toString());
	}

}
