package com.example.hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class ExampleQuestions {

	public static void main(String[] args) {
//		String s1 = "Hi, my name is Cody";
//		String s2 = "Hello Cody, my name is John";
//
//		String[] s1Split = s1.split("[\\s\\p{Punct}]+");
//		String[] s2Split = s2.split("[\\s\\p{Punct}]+");
//
//		List<String> s1List = new ArrayList<>(Arrays.asList(s1Split));
//
//		s1List.addAll(Arrays.asList(s2Split));
//		s1List.stream().distinct().forEach(System.out::println);

		String s = "i there buddy, my nam is Coy";

		String[] sSplit = s.split("[\\s\\p{Punct}]+");

		String target = "00";

		for (String word : sSplit) {
			if (word.length() % 2 == 0 && word.length() > target.length()) {
				target = word;
			}
		}

		System.out.println(target);

	}
}
