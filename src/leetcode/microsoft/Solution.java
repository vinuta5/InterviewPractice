package leetcode.microsoft;
import java.util.*;
// CLASS BEGINS, THIS CLASS IS REQUIRED
public class Solution
{        static // jack : 
    // METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED
    List<String> retrieveMostFrequentlyUsedWords(String literatureText, 
                                                 List<String> wordsToExclude)
    {
        List<String> mostFreqWords = new ArrayList<String>();
        literatureText = literatureText.toLowerCase().replaceAll("[^a-zA-Z0-9]"," ").trim();
        String [] strArr = literatureText.split(" ");
        //populate the counts for each word
        HashMap<String,Integer> countMap = new HashMap();
        for(String word : strArr){
        	if(!wordsToExclude.contains(word)){
        		countMap.put(word,countMap.containsKey(word)? countMap.get(word)+ 1: 1);
        	}
        }
        //get the maximum repeated count from the countMap
        int maxCount = 0;
        for(int count : countMap.values()){
            if(count > maxCount){
                maxCount = count;
            }
        }
        //get the words with maxCount and not in the exclude set
        for(Map.Entry<String,Integer> entry : countMap.entrySet()){
            if(entry.getValue() == maxCount){
                mostFreqWords.add(entry.getKey());
            }
        }
        
        return mostFreqWords;
    }
    public static void main(String [] args){
    	String str = "Jack and Jill wanted to purchase milk and cheese. Cheese is Jack's and Jill's favorite food.";
    	ArrayList<String> exclude = new ArrayList();
    	exclude.add("is");
    	exclude.add("and");
    	for(String res: retrieveMostFrequentlyUsedWords(str,exclude)){
    		System.out.println(res);
    	}
    }
    
}
