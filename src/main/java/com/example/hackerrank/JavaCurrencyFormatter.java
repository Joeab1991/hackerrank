package com.example.hackerrank;

import java.util.Locale;
import java.util.Scanner;
import java.text.NumberFormat;

public class JavaCurrencyFormatter {

	public static void main(String[] args) {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner scanner = new  Scanner(System.in);
		double payment = scanner.nextDouble();
		scanner.close();

		System.out.println("US: " + NumberFormat.getCurrencyInstance(Locale.US).format(payment));

		//India should return "India: Rs.12,324.13"

		System.out.println("India: Rs." + (NumberFormat.getCurrencyInstance(new Locale("en", "IN")).format(payment)).substring(1));

		System.out.println("China: " + NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment));
		System.out.println("France: " + NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment));
	}
}