package com.interviewasked;
import java.util.*;

class Interval{
	int start,end;
	Interval(int start,int end){
		this.start = start;
		this.end = end;
	}
}
class IntervalComparator implements Comparator<Interval>{
	@Override
	public int compare(Interval one,Interval two){
		return one.start - two.start;
	}
}
public class MeetingRooms {
	
	public static int getMinimumRooms(ArrayList<Interval> meetings){
		if(meetings.size() == 0) return 0;
		Collections.sort(meetings, new IntervalComparator());
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		pq.add(meetings.get(0).end);
		for(int i = 1; i < meetings.size(); ++ i){
			Interval current = meetings.get(i);
			if(current.start >= pq.peek()){
				pq.remove();
			}
			pq.add(current.end);
		}
		return pq.size();
	}
	
	public static void main(String[] args) {
		ArrayList<Interval> list = new ArrayList<Interval>();
		list.add(new Interval(1,4));
		list.add(new Interval(5,6));
		list.add(new Interval(8,9));
		list.add(new Interval(2,6));
		System.out.println(getMinimumRooms(list));
		//(1,4) (2,6) (5,6) (8,9)
	}

}
