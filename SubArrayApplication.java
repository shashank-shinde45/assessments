package org.mywork.java.demo;

import java.util.logging.Logger;

public class SubArrayApplication {

	public SubArrayApplication() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// int[] subArray = {8,9};

		int[] subArray = { 2, 5 };
		int[] mainArray = { 2, 5, 3, 8, 9 };
		//logic for accepting command line array can be added if required.
		
		SubArrayApplication subArrayApplication = new SubArrayApplication();
		
		subArrayApplication.findSubarrayPostion(mainArray,subArray);

	}

	//solution without any utility method or collection method directly
	public String findSubarrayPostion(int[] mainArray, int[] subArray) {

		int firEleIndex = -1;
		int matchCount = 0;
		firEleIndex = -1;
		try {
			for (int i = 0; i < subArray.length; i++) {
				System.out.println("--outer loop");

				for (int j = 0; j < mainArray.length; j++) {
					System.out.println("--inner loop for element" + mainArray[j]);
					// get first element matching
					if (subArray[i] == mainArray[j] && firEleIndex == -1) {

						firEleIndex = j;
						matchCount++;
						break;// No need to traverse further inner loop
					}
					if (subArray[i] == mainArray[j]) {
						matchCount++;

					}

				}
				System.out.println("matchcount::" + matchCount);
				if (matchCount == subArray.length) {
					System.out.println("subarry found at index :" + firEleIndex);
					return "subarry found at index :" + firEleIndex;

					// No need to traverse further outer loop
				}
			}
			if (matchCount != subArray.length) // no exact match all element
				return "No Subarray Found";
		} catch (Exception e) {
			
			return "Couldn't peform check, enhance your logic or error handling";
		}
		return "check your input parameter";
	}

}
