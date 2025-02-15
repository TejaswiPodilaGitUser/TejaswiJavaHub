package com.mycodepractice.duplicatesremove;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Remove Duplicates in the given String Using HashSet
 * 
 */
public class RemoveDuplicatesInString {

	public static void main(String[] args) {

		String[] inputArray = { "Hi","Hello","Hi","Hello","Hi","ABC" };

		System.out.println("Before Removing Duplicates: " + Arrays.toString(inputArray));

		Set<String> outputHashSet = new HashSet<>();

		for (String num : inputArray) {
			outputHashSet.add(num);
		}

		System.out.println("After Removing Duplicates: " + outputHashSet);
	}

}
