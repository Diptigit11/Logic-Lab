package com.example;
import java.util.*;
public class CountFrequencyOfEachWord {
	public static void func(String inp) {
		HashMap<String , Integer> map = new HashMap<>();
		String[] words = inp.split(" ");
		for(int i = 0 ; i < words.length ; i++) {
			map.put(words[i], map.getOrDefault(words[i], 0) + 1);
		}
		for(Map.Entry<String , Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	}
//✅ 8. Count Frequency of Each Word

//Topic: Strings & Arrays
//Task: Given a sentence, count how many times each word appears.
//Example Input: "Java is fun and Java is powerful"
//Expected Output:
//Java: 2
//is: 2
//fun: 1
//and: 1
//powerful: 1
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
System.out.println("Enter a sentence, count how many times each word appears.");

String inp = sc.nextLine();
func(inp);
	}

}
