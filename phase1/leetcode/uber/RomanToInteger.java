/*
 Initialize a lookup map with roman numerals and their values
 traverse through each char in the string and add that to the result num
 Also , keep track of prev number , After every iteration current will be prev
 before updating the prev number, check if current is greater than prev- if yes, substract (2* prev) from result number
 * */

package leetcode.uber;
import java.util.*;
public class RomanToInteger {

	public static void main(String[] args) {
		System.out.println(getIntFromRoman("MCMXCIV"));
	}
	//                                     p   c
	//"MCMXCIV" --- 1000, 100,1000, 10, 100, 1, 5
	// num = 1000, num = 1100, num = 1900, num = 1910, num = 1990, num = 1991, num = 1994 
	public static int getIntFromRoman(String roman){
		HashMap<Character,Integer> romanNumbers = new HashMap();
		romanNumbers.put('I', 1);
		romanNumbers.put('V', 5);
		romanNumbers.put('X', 10);
		romanNumbers.put('L', 50);
		romanNumbers.put('C', 100);
		romanNumbers.put('D', 500);
		romanNumbers.put('M', 1000);
		
		int num = 0, prev = 0;
		for(int i = 0; i < roman.length(); ++ i){
			int curr = romanNumbers.get(roman.charAt(i));
			num += curr;
			if(curr > prev){
				num -= (2 * prev);
			}
			prev = curr;
		}
		return num;
	}

}
