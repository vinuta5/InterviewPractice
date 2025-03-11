package com.interviewasked;
import java.util.*;
public class HistogramElementImpl implements HistogramElement{
	
	int value,count;
	HistogramElementImpl(int value,int count){
		this.value = value;
		this.count = count;
	}
	@Override
	public int getValue() {
		return this.value;
	}
	@Override
	public int getCount() {
		return this.count;
	}
	Set<HistogramElement> buildHistogram(int[] input){
		HashMap<Integer,Integer> histogram = new HashMap<Integer,Integer>();
		Set<HistogramElement> histogramSet = new LinkedHashSet<HistogramElement>();
		for(int num : input){
			histogram.put(num, histogram.containsKey(num) ? histogram.get(num) + 1 : 1);
		}
		for(Map.Entry<Integer,Integer> entry : histogram.entrySet()){
			histogramSet.add(new HistogramElementImpl(entry.getKey(),entry.getValue()));
		}
		return histogramSet;
	}
	

}
