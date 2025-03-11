package com.interviewasked;

import java.util.*;
import java.util.StringJoiner;

public class Abbreviated {
	public static String getAbbreviated(String name){
		StringBuffer abbreviatedName = new StringBuffer();
		String [] nameArr = name.split(" ");
		abbreviatedName.append(nameArr[0]);
		abbreviatedName.append(" ");
		for(int i = 1; i < nameArr.length - 1; ++ i){
			abbreviatedName.append(nameArr[i].charAt(0));
			abbreviatedName.append('.');
			abbreviatedName.append(" ");
		}
		abbreviatedName.append(nameArr[nameArr.length -1]);
		return abbreviatedName.toString();
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//System.out.println(getAbbreviated(sc.nextLine()));
		String str = "This is This is This is This This";
		getStringIndexes(str,"This");
	}
	public static ArrayList<Integer> getStringIndexes(String text,String str){
		ArrayList<Integer> final_list = new ArrayList<Integer>();
		int index = text.indexOf(str);
		while(index >= 0){
			final_list.add(index);
			index = text.indexOf(str,index + 1);
		}
		return final_list;
	}
	
}
