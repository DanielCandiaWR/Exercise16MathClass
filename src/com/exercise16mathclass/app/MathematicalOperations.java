package com.exercise16mathclass.app;
import java.lang.Math;
import java.util.Scanner;
public class MathematicalOperations {
	public static void main(String[] args) {
		double number = 3.5;
		double number2 = 5.5;
		Scanner input = new Scanner(System.in);
		System.out.println("e Value: "+Math.E);
		System.out.println("PI value: "+Math.class);
		System.out.println("Absolute value of -2.15 is "+Math.abs(-2));
		System.out.println("The cube root of 27 is "+Math.cbrt(27));
		System.out.println("The round of 3.76 is "+Math.round(number));
		System.out.println("The round ceil 3.76 is "+Math.ceil(number));
		System.out.println("The round floor of 3.76 is "+Math.floor(number));
		System.out.println("Increment of 5: "+Math.incrementExact(5));
		System.out.println("Decrement of 5: "+Math.decrementExact(5));
		System.out.println("Powe value of 3 Euler is "+Math.exp(3));
		System.out.println(String.format("Which is bigger? %.2f or %.2f : %.2f",number,number2, Math.max(number, number2)));
		System.out.println(String.format("Which is smaller? %.2f or %.2f : %.2f",number,number2, Math.min(number, number2)));
		System.out.println("Sin of 0 degres is "+Math.sin(0));
		System.out.println("Sin of PI/2 degres is "+Math.sin(Math.PI/2));
		System.out.println("Cos of 0 degres is "+Math.cos(0));
		System.out.println("Cos of PI/2 degres is "+Math.cos(Math.PI/2));
		for(int i=0;i<5;i++) {
			System.out.println("Input a number: ");
			number = input.nextDouble();
			System.out.println("The square of "+number+" is "+Math.sqrt(number));
		}
		int counter = 0;
		do {
			
		}while(counter<5);
	}
}
