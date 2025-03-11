package leetcode.microsoft;

public class ReverseStringWordwise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverseWords("a  b"));
	}
	public static String reverseWords(String s){
		s = s.trim();
		if(s.isEmpty()) return s;
		String [] strArr = s.split("\\s+");
		for(int i = 0, j = strArr.length - 1; i < j ; i ++, j --){
			String temp = strArr[i];
			strArr[i] = strArr[j];
			strArr[j] = temp;
		}
		return String.join(" ", strArr);
	}
}
