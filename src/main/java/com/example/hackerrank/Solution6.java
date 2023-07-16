package com.example.hackerrank;

import java.util.Scanner;

public class Solution6 {
	static int b;
	static int h;

	public static void main(String[] args) {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner scanner = new  Scanner(System.in);
		b = scanner.nextInt();
		h = scanner.nextInt();
		if (b > 0 && h > 0) {
			System.out.println(b * h);
		} else {
			System.out.println("java.lang.Exception: Breadth and height must be positive");
		}





	}
}
