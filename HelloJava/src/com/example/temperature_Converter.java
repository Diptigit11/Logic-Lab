package com.example;
import java.util.*;
public class temperature_Converter {

	public static void main(String[] args) {
System.out.println("Welcome to Conversion Program");
String inp ;
Scanner sc = new Scanner(System.in);
do {
	System.out.println("\nFor C to F conversion enter CtoF");
	System.out.println("For f to c conversion enter FtoC");
	System.out.println("For exit enter exit");
	inp = sc.nextLine();
	switch(inp) {
	case "CtoF" :
		System.out.println("Enter the value of Celsius");
		float cel = sc.nextFloat();
		float far = (cel * 9/5) + 32 ;
		System.out.println("calculated farenheit value is : " + far);
		 sc.nextLine();
		break;
		
	case "FtoC" :
		System.out.println("Enter the value of farenheit");
		float faren = sc.nextFloat();
		float celsius = (faren - 32) * 5/9 ;
		System.out.println("calculated celsius value is : " + celsius);
		 sc.nextLine();
		break;
	
	case "exit":
		System.out.println("exiting the program");
		break;
		
    default:
    	System.out.println("invalid");
	}
} while(!inp.equals("exit"));
sc.close();
	}

}
