package com.mycodepractice.duplicatesremove;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Remove Duplicates in the given array Using HashSet
 */
public class RemoveDuplicatesInArrayUsingHashSet {

	public static void main(String[] args) {

		Integer[] inputArray = { 2, 3, 3, 4, 4, 4, 5, 5, 4, 6, 1, 5, 7, 8 };

		System.out.println("Before Removing Duplicates: " + Arrays.toString(inputArray));

		Set<Integer> outputHashSet = new HashSet<>();

		for (int num : inputArray) {
			outputHashSet.add(num);
		}

		System.out.println("After Removing Duplicates: " + outputHashSet);
	}

}