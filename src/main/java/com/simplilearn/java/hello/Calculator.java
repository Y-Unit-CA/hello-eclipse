package com.simplilearn.java.hello;

public class Calculator {

	public static void main(String[] args) {
		
		System.out.println("Add: " + add(5,4));
		System.out.println("Subtract: " + subtract(5,4));
		System.out.println("Multiply: " + multiply(5,4));
		System.out.println("Divide: " + divide(5,4));
		System.out.println("Round: " + round(5.1374));
		System.out.println("isEven: " + isEven(10));
		System.out.println("isOdd: " + isOdd(8));
		System.out.println("XNOR: " + XNOR(true, false));
		System.out.println("addThreeNumbers: " + addThreeNumbers(5,4,23));
		System.out.println("lessThan: " + lessThan(5,4));
	}
	
	// simple addition
	private static int add (int left, int right) {
		return left + right;
	}
	
	// simple subtraction
	private static int subtract (int left, int right) {
		return left - right;
	}

	// multiply two integers and return an integer
	private static int multiply (int left, int right) {
		return left * right;
	}
	
	// divide: take two integers and return double
	private static double divide (int left, int right) {
		// return (double) left / right;
		return left / (double) right;    // better
	}
	
	// round: take a single double param, return int
	private static int round (double d) {
		// return (int) Math.round(d);
		return (int) (d + 0.5);
	}
	
	// isEven (take a single integer) and return true if it is even
	private static boolean isEven (int i) {
		// return (i % 2 == 0);
		return i % 2 == 0;
	}
	
	// isOdd (take a single integer) and return true if it is odd - don't use modular operator
	private static boolean isOdd (int i) {
		// return (i % 2 == 1) && (i != 0);
		// could cleverly use bitwise operator
		return ! isEven(i);
	}
	
	// XNOR (take two booleans and returns true if they are both true or both false)
	private static boolean XNOR (boolean x, boolean y) {
		// return (x && y) || (!x && !y);
		return x == y;
	}
	
	// add three numbers
	private static int addThreeNumbers (int first, int second, int third) {
		return first + second + third;
	}
	
	// lt (take two integers and return true if left is less than right)
	private static boolean lessThan (int left, int right) {
		return left < right;
	}	
}
