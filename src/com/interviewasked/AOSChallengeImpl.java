package com.interviewasked;

import java.util.*;
public class AOSChallengeImpl implements AOSChallenge {	
	 /*
    	Solution 1: 
    	Update a temporary array with the result values at each index and take a tmp variable initializing to 1
    	Traverse through the input array from 0 to end and update temporary array with values
    	Multiply with current array value and store it next index.
    	Then traverse with input array from end to 0 and repeat the 3 step.
    	Time Complexity : O(N), N is the length of the array
    	Space Complexity : O(N), extra space for temporary array with size N				
	  */
	
	int[] productOfOtherPositions(int[] input){
		//base condition
		if(input.length == 1) return new int[]{};
		//initializing a temporary array which is the result
		int [] result = new int[input.length];
		//initialize the tmp variable to 1 
		for(int i = 0,tmp = 1; i < input.length; ++ i){
			result[i] = tmp;
			tmp *= input[i];
		}
		for(int i = input.length - 1, tmp = 1; i >= 0; -- i){
			result[i] *= tmp;
			tmp *= input[i];
		}
		return result;
	}
	
	 /* Solution 2:
	   Split the input string into string array with spaces
	   Traverse through the array with two pointers i and j initialized to 0 and array length
	   swap the strings at i and j positions
	   return the result string
	   Time Complexity: O(N), N is the length of the string
	   Space Complexity: O(N), extra space to storing the split string
    
	  */
	String reverseWordsInSentence(String input){
		//base condition
		if(input.length() < 0) return "";
		String [] strArr = input.split(" ");
		//need not return if the string has only one word
		if(strArr.length == 1) return strArr[0];
		for(int i = 0, j = strArr.length - 1; i < j; ++ i, -- j){
			String tmp = strArr[i];
			strArr[i] = strArr[j];
			strArr[j] = tmp;
		}
		return strArr.toString();
	}
	
	 /*Solution 3:
	  Initialize a string builder to append the words and a counter from 1 to max
	  Check for conditions, if multiple of both, if multiple of 3, if multiple of 5 and update the string
	  Time Complexity : O(max), max - looping through max element.
	  Space Complexity : No additional space except for the result string
	    
	  */
	String replaceMultiplesOf3And5WithText(int max){
		StringBuilder result = new StringBuilder();
		int counter = 1;
		while(counter <= max){
			boolean three = counter % 3 == 0, five = counter % 5 == 0;
			if(three && five) result.append("AppleOnline");
			else if(three) result.append("Apple");
			else if(five) result.append("Online");
			++counter;
		}
		return result.toString();
		
	}
	

}
