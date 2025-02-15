package com.mycodepractice.duplicatesremove;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Remove Duplicates in the given array
 * Using Java 8 Streams
 */
public class RemoveDuplicatesInArrayUsingJava8 {

	public static void main(String[] args) {

		Integer[] inputArray = { 2, 3, 3, 4, 4, 4, 5, 5, 4, 6, 1, 5, 7, 8 };

		System.out.println("Before Removing Duplicates: " + Arrays.toString(inputArray));

		Set<Integer> outputHashSet= Arrays.stream(inputArray).collect(Collectors.toSet());

		System.out.println("After Removing Duplicates using Java 8: " + outputHashSet);
	}

}
