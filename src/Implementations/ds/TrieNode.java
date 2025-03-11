package Implementations.ds;
import java.util.*;

public class TrieNode {
	int noOfChildren = 0;
	HashMap<Character,TrieNode> children = new HashMap();
	 TrieNode getNode(char ch){
		 return children.get(ch);
	 }
	 void setNode(char ch,TrieNode node){
		 children.put(ch, node);
	 }
	 void addNode(String str){
		 addNodeHelper(str,0);
	 }
	 void addNodeHelper(String str,int index){
		 noOfChildren ++;
		 if(index == str.length()) return;
		 char current = str.charAt(index);
		 TrieNode child = getNode(current);
		 if(child == null){
			 child = new TrieNode();
			 setNode(current,child);
		 }
		 child.addNodeHelper(str, index+1);
	 }
	 int getChildrenCount(String str){
		 return getChildrenCountHelper(str,0);
	 }
	 int getChildrenCountHelper(String str,int index){
		 if(index == str.length()) return noOfChildren;
		 TrieNode child = getNode(str.charAt(index));
		 if(child == null) return 0;
		 return child.getChildrenCountHelper(str,index + 1);
	 }
	
		
	public static void main(String[] args) {
		TrieNode obj = new TrieNode();
		obj.addNode("hello!india");
		obj.addNode("hello");
		obj.addNode("india!hello");
		System.out.println(obj.getChildrenCount("india"));
	}

}
