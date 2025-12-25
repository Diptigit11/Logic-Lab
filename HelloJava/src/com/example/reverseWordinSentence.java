package com.example;
import java.util.*;
public class reverseWordinSentence {
	public static void main(String[] args) {
		// Example Input: "Java is fun"
		//Expected Output: "avaJ si nuf"
		Scanner sc = new Scanner(System.in);
		StringBuilder ans = new StringBuilder();
		String input = sc.nextLine();
		
String[] words = input.split(" "); //["java" , "is" , "fun"]
for(int j = 0 ; j < words.length ; j++) {
	String word = words[j];
	StringBuilder ans1 = new StringBuilder();
	for(int i = word.length() - 1 ; i >= 0 ; i--) {
		ans1.append(word.charAt(i));
	}
System.out.print(ans1.toString() + " ");
	}
	}
}
