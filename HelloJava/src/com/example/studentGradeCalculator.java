package com.example;
import java.util.Scanner;
public class studentGradeCalculator {
public static void main(String[] args) {
	System.out.println("enter the 5 subject's marks");
	Scanner sc = new Scanner(System.in);
	int marks[] =  new int[5]; 
	for(int i = 0 ; i < 5 ; i++) {
		marks[i] = 	sc.nextInt();
	}
		int sum = 0;
		char grade;
		float percentage ;
	for(int i = 0 ; i < marks.length ; i++) {
		sum = sum + marks[i];
	}
	percentage = ((float) sum / 500 ) * 100;
	
	if(percentage >= 90) {
		grade = 'A';
	}else if(percentage >= 75) {
		grade = 'B';
	}else if(percentage >= 60) {
		grade = 'C';
	}else if(percentage >= 40) {
		grade = 'D';
	}else {
		grade = 'F';
	}
	System.out.println("Percentage = " + percentage);
	System.out.println("Grade = " + grade);	
}

}
