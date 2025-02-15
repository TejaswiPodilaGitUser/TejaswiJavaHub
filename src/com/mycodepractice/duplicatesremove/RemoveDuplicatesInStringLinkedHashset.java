package com.mycodepractice.duplicatesremove;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Remove Duplicates in the given String Using HashSet
 * 
 */
public class RemoveDuplicatesInStringLinkedHashset {

	public static void main(String[] args) {

		String[] inputArray = { "Hi","Hello","Hi","Hello","Hi","ABC" };

		System.out.println("Before Removing Duplicates: " + Arrays.toString(inputArray));

		Set<String> outputHashSet = new LinkedHashSet<>();

		for (String num : inputArray) {
			outputHashSet.add(num);
		}

		System.out.println("After Removing Duplicates: " + outputHashSet);
	}

}
