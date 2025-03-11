package com.interviewasked;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Juniper {
    public static void main(String args[] ) throws Exception {
        int [] arr = {1,1,2,2,9,21,21,23,23,49,50};
        ArrayList [] range = new ArrayList [3];
        ArrayList<Integer> range1 = new ArrayList<Integer>();
        range1.add(1);
        range1.add(5);
        ArrayList<Integer> range2 = new ArrayList<Integer>();
        range2.add(20);
        range2.add(30);
        ArrayList<Integer> range3 = new ArrayList<Integer>();
        range3.add(40);
        range3.add(50);
        range[0] = range1;
        range[1] = range2;
        range[2] = range3;
        for(int count : getCountOfValues(arr,range)){
            System.out.println(count);
        }
        
    }
    //total complexity : O(a) + O(s) = O(a + s) - for each range given, if there are n ranges O(n(a + s))
    public static int [] getCountOfValues(int [] arr,ArrayList [] range){
        int [] result = new int[range.length];
        //int count = 0,low = range[0],high = range[1];
        NavigableMap<Integer,Integer> noCounts = new TreeMap<Integer,Integer>();
        //populate the count : traverse O(a), a is the length of the array
        for(int val : arr){
            noCounts.put(val,noCounts.containsKey(val) ? noCounts.get(val) + 1 : 1);
        }
        for(int i = 0; i < range.length; ++ i){
            ArrayList<Integer> list = range[i];
            SortedMap<Integer,Integer> m = noCounts.subMap(list.get(0),list.get(1));
            for(int count : m.values()){
                result[i] += count;
            }
            
        }
        return result;
        
        //get the keys which fall in the range by traversing through each key in the key set - O(s), s is the size of the keyset or number of unique numbers/keys
        /*Set<Integer> setOfKeys = noCounts.keySet();
        for(int key : setOfKeys){
            if(key >= low && key <= high){
               count  += noCounts.get(key); 
            }
        }
        return count;
        */
        
    }
  
}