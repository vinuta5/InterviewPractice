package leetcode.amazon;
import java.util.*;

class LexicoComparator implements Comparator<String>{
	public int compare(String s1, String s2){
		return s1.compareTo(s2);
	}
}
class LengthComparator implements Comparator<String>{
	public int compare(String s1,String s2){
		return s1.length() - s2.length();
	}
}
class CharacterComparator implements Comparator<Character>{
	public int compare(Character ch1, Character ch2){
		return ch1.compareTo(ch2);
	}
}

public class SortList {

	public static void main(String[] args) {
		List<String> list = new ArrayList();
		list.add("xinh hyder pong xing");// 3, 1 ,2, 4
		list.add("11111 asoo best attc");
		list.add("webs ceil patt song");
		list.add("1234 sile paty agin");
		for(String str : sortFile(list,4)){
			System.out.println(str);
		}
		
	}
	public static List<String> sortLogFile(List<String> logfile,int logsize){
		List<String> result = new ArrayList();
		HashMap<String,String> lookUp = new HashMap();
		for(String line : logfile){
			List<String> eachLineSorted = new ArrayList<String>(Arrays.asList(line.split(" ")));
			Collections.sort(eachLineSorted, new Comparator<String>(){
				public int compare(String s1, String s2){
					return s1.compareToIgnoreCase(s2);
				}
			});
			lookUp.put(eachLineSorted.get(0), line);
		}
		List<Map.Entry<String,String>> sortedKeys = new ArrayList<Map.Entry<String,String>>(lookUp.entrySet());
		Collections.sort(sortedKeys,new Comparator<Map.Entry<String,String>>(){
            public int compare(Map.Entry<String,String> entry1, Map.Entry<String,String> entry2){
                return ((String)entry2.getValue()).compareTo(entry1.getValue());
            } 
        });
		System.out.println("done");
		for(Map.Entry<String, String> entry : sortedKeys){
			result.add(entry.getValue());
		}
		return result;
	}
	public static List<String> sortFile(List<String> logfile,int logsize){
		List<String> numberList = new ArrayList<String>();
		List<String> alphaList = new ArrayList<String>();
		 for(String str : logfile){
			 if(Character.isDigit(str.charAt(0))) numberList.add(str);
			 else alphaList.add(str);
		 }
		 Collections.sort(alphaList,new LexicoComparator());
		 Collections.sort(alphaList,new LengthComparator());
		 Collections.sort(numberList,new LexicoComparator());
		 Collections.sort(numberList,new LengthComparator());
		 alphaList.addAll(numberList);
		 return alphaList;
	}
	
}

