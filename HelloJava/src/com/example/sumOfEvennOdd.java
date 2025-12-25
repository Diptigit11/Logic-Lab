package com.example;
import java.util.*;
public class sumOfEvennOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the number\n");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0 ; i < n ; i++) {
			arr[i] = sc.nextInt();
		}
		//main function
		int odd  = 0;
		int even = 0;
		for(int i = 0 ; i < n ; i++) {
			if(arr[i] % 2 == 0) {//its even
				even+=arr[i];
			}else {
				odd+=arr[i];
			}
		}
System.out.println( "sum of even is : " + even);
System.out.println( "sum of odd is : " + odd);
	}

}
