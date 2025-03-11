package cracking.hackerrank;

public class Strings_MakingAnagrams {
	public static int makeAnagrams(String a,String b){
		int noOfCharsRemoved = 0;
		int [] charCount_a = getCharCount(a);
		int [] charCount_b = getCharCount(b);
		for(int i = 0; i < charCount_a.length; ++ i){
			noOfCharsRemoved += Math.abs(charCount_a[i] - charCount_b[i]);
		}
		return noOfCharsRemoved;
	}
	public static int [] getCharCount(String str){
		int [] charCount = new int[26];
		for(char ch : str.toCharArray()){
			charCount[ch - 'a'] += 1;
		}
		return charCount;
	}
	
	public static void main(String[] args) {
		System.out.println(makeAnagrams("abc","bcab"));
	}

}
