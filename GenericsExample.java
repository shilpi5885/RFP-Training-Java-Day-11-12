package com.bridgelabz.demo;

public class GenericsExample {

	public static <T extends Comparable<T>> T testMaximum(T x, T y, T z) {
		T max = x;

		if (y.compareTo(max) > 0)
			max = y;

		if (z.compareTo(max) > 0)
			max = z;

		return max;
	}

	public static void main(String args[]) {
		System.out.printf("Maximum of %d, %d and %d is %d\n\n", 3, 4, 5, testMaximum(3, 4, 5));
		System.out.printf("Maximum of %.1f, %.1f and %.1f is %.1f\n\n", 6.6, 8.8, 7.7, testMaximum(6.6, 8.8, 7.7));
		System.out.printf("Maximum of %s, %s and %s is %s\n", "apple", "peach", "banana",
				testMaximum("apple", "peach", "banana"));
	}
}