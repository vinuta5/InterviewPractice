package leetcode.microsoft;

public class ValidPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isValidPalindrome("0P"));

	}
	public static boolean isValidPalindrome(String s){
		if(s.isEmpty()){
			return true;
		}
		int start = 0,end = s.length() - 1;
		while(start < end){
			if(!isAlphanumeric(s.charAt(start))){
				start ++;
			}
			else if(!isAlphanumeric(s.charAt(end))){
				end --;
			}
			else if(Character.toLowerCase(s.charAt(start)) == Character.toLowerCase(s.charAt(end))){
				start ++;
				end --;
			}
			else{
				return false;
			}
		}
		return true;
	}
	public static boolean isAlphanumeric(char ch){
		return (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') || (ch >= '0' && ch <= '9');
	}
}
