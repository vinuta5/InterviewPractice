package leetcode.microsoft;

public class ReverseStringWordwiseII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char [] arr = {'t','h','e',' ','s','k','y',' ','i','s',' ','b','l','u','e'};
		reverseStringWords(arr);
	}
	public static void reverseStringWords(char [] str){
		if(str.length == 0) return;
		int start = 0;
		for(int i = 0; i <= str.length; ++ i ){
			if(i == str.length || str[i] == ' '){
				reverse(str,start,i - 1);
				start = i + 1;
			}
		}
		reverse(str,0,str.length - 1);
	}
	public static void reverse(char [] str, int start,int end){
		while(start < end){
			char temp = str[start];
			str[start] = str[end];
			str[end] = temp;
			start ++;
			end --;
		}
	}
}
