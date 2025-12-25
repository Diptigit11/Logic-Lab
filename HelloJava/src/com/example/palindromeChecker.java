package com.example;
import java.util.*;
public class palindromeChecker {
	public static boolean palindromeChecking(String s) {
		if(s.length() == 1) return true;
		char[] ch = s.toCharArray();
		int left = 0;
		int right = ch.length-1;
		while(left < right) {
			if(ch[left] != ch[right]) {
				return false;
			}
			left++;
			right--;
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
		String inp = sc.nextLine();
		System.out.println(palindromeChecking(inp));

	}

}
