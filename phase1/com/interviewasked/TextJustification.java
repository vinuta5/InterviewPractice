package com.interviewasked;
import java.util.*;
public class TextJustification {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] words = {"This","is","an","example","of","text","justification"};
		ArrayList<String> list = textJustify(words,16);
		for(String str : list){
			System.out.println(str +" ");
		}

	}
	public static ArrayList<String> textJustify(String [] words,int l){
		//count the number of words with right spaces
		ArrayList<String> result = new ArrayList<String>();
		int totalWords = words.length;
		while(totalWords > 0){
			int wordCount = 0, start = 0,end = words.length, charCount = 0; 
			for(String word : words){
				if(charCount >= word.length()){
					wordCount ++;
					charCount -= word.length() - 1;
				}
				else{
					charCount += wordCount;
					break;
				}
			}
			//inserting the right number of spaces and forming a string
			StringBuilder sb = new StringBuilder();
			int spacesAvailable = charCount, eachSpace = (int) Math.ceil(spacesAvailable/(wordCount - 1));
			for(int i = start,counter = 1;counter <= wordCount; i ++,counter ++){
				sb.append(words[i]);
				sb.append("\\s{eachSpace}");
			}
			result.add(sb.toString());
			totalWords -= wordCount; 
		}
		return result;
	}
}
