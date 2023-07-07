package com.example.hackerrank;
import java.io.*;
import java.util.*;
import java.util.stream.IntStream;

import static com.example.hackerrank.JPMorganTest.deleteProducts;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class JPMorganTest {
		/*
		 * Complete the 'deleteProducts' function below.
		 *
		 * The function is expected to return an INTEGER.
		 * The function accepts following parameters:
		 *  1. INTEGER_ARRAY ids
		 *  2. INTEGER m
		 */

		public static int deleteProducts(List<Integer> ids, int m) {
			// Write your code here
			//a salesperson has a list of product ids and wants to reduce the number of products they have to sell.
			//They can remove as many as m items from the list
//			determine the minimum number of unique ids that will remain in the list after performing at most m deletions
			ids.sort(Comparator.naturalOrder());
			int count = 0;
			int i = 0;
			while (i < ids.size()) {
				int j = i + 1;
				while (j < ids.size() && ids.get(i).equals(ids.get(j))) {
					j++;
				}
				if (j - i <= m) {
					m -= j - i;
					count++;
				}
				i = j;
			}
			return count;

		}
	}



//class Solution {
//	public static void main(String[] args) throws IOException {
//		deleteProducts(Arrays.asList(1, 2, 3, 4, 5));
//	}
//}

