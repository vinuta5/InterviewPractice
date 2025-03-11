/* Given a string, determine if a permutation of the string could form a palindrome.
  	Input: "code"
  	Output: false
conditions - if all the chars are lowercase, ignore case to determine palindrome a!= A  
 
 */

/*
	 All characters in the string should be repeated with a number divisible by 2 with utmost 1 character exception
	 Populate a lookup with char counts
	 traverse through the lookup and keep track of notdivisible chars that are not divisible by 2
	 if the notdivisible chars counts exceeds 1, return false. 	
*/

package leetcode.uber;
import java.util.*;

public class PalindromePermutation {
	public static void main(String[] args) {
		System.out.println(isPalindromePermutation("abac"));
	}
	//abac - a- 2, b - 1, c - 1
	// noDivCount = 2 return
	public static boolean isPalindromePermutation(String str){
		// if ignore case, convert string to lowercase
		if(str.length() < 1) return false;
		int [] charCounts = new int[256];
		for(int i = 0; i < str.length(); ++ i){
			charCounts[str.charAt(i) - 'a'] += 1;
		}
		int noDivCount = 0;
		for(int count : charCounts){
			if(count % 2 != 0) {
				noDivCount ++;
				if(noDivCount > 1) return false;
			}
		} 
		return true;
	}

}
