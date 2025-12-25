package com.example;
import java.util.*;
public class secondLargest {
	public static int Find(int[] arr) {
		if(arr.length < 2) return -1;
		int largest = Integer.MIN_VALUE;
		int s_largest = Integer.MIN_VALUE;
		for(int i = 0 ; i < arr.length ; i++) {
			if(arr[i] > largest) {
				s_largest = largest;
				largest = arr[i];
			}
			else if(arr[i] > s_largest &&  arr[i] != largest) {
				s_largest = arr[i];
			}
		}
		if (s_largest == Integer.MIN_VALUE) {
	        return -1; // No second largest
	    }
		return s_largest;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the number\n");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0 ; i < n ; i++) {
			arr[i] = sc.nextInt();
		}
System.out.println(Find(arr));
	}

}
