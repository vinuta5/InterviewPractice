package cracking.hackerrank;
import java.util.*;
public class HashTable_RansomNote {
	public static boolean isRansomNote(String [] magazine, String [] ransom){
		HashMap<String,Integer> wordCountMap_Mag = getWordCounts(magazine);
		HashMap<String,Integer> wordCountMap_Ran = getWordCounts(ransom);
		for(Map.Entry<String,Integer> entry : wordCountMap_Ran.entrySet()){
			if(!wordCountMap_Mag.containsKey(entry.getKey())) return false;
			if(entry.getValue() > wordCountMap_Mag.get(entry.getKey())) return false;
		}
		return true;
	}
	public static HashMap<String,Integer> getWordCounts(String [] words){
		HashMap<String,Integer> wordCountMap = new HashMap<String,Integer>();
		for(String word : words){
			wordCountMap.put(word, wordCountMap.containsKey(word)?wordCountMap.get(word) + 1 : 1);
		}
		return wordCountMap;
	}
	public static void main(String[] args) {
		String [] magazine = {"two", "times", "three", "is", "not", "four"};
		String [] ransom = {"two", "times", "two", "is", "four"};
		if(isRansomNote(magazine,ransom)){
			System.out.println("Yes");
		}
		else{
			System.out.println("No");
		}
	}

}
