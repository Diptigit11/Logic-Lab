package com.example;
import java.util.*;
public class factorial {
	public static int calculateFactorial(int n) {
		if( n == 1) {
			return 1;
		}
		return n * calculateFactorial(n-1);
	}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number");
	int n = sc.nextInt();
	System.out.println(calculateFactorial(n));
}
}
