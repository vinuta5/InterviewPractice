package com.interviewasked;
import java.util.*;
public class Example {
	
	static class Node{
		long data;
		Node left,right;
		boolean hasHash = false;
		Node(String data){
			if(data.equals("#")) hasHash = true;
			this.data = convertStringToLong(data);
			left = right = null;
		}
	}
	public static Node root;
	public static void constructTree(String str,int n){
		String [] nodes = str.split(" ");
		if(root == null){
			root = new Node(nodes[0]);
		}
		int i = 1;
		Queue<Node> queue = new LinkedList<Node>();
		Node current = root;
		queue.add(root);
		while(!queue.isEmpty() && i < nodes.length - 1){
			current = queue.poll();
			if(current.left == null && (!current.hasHash)){
				current.left = new Node(nodes[i++]);
				queue.add(current.left);
			}
			if(current.right == null && (!current.hasHash)){
				current.right = new Node(nodes[i++]);
				queue.add(current.right);
			}	
		}
		
	}
	public static long convertStringToLong(String str){
		if(str.equals("#")) return 0;
		return Long.parseLong(str);
	}
	
	public static long maxSum(String str,int n){
		constructTree(str,6);
		return getSum(root);
		
	}
	public static long getSum(Node root)
    {
        if (root == null) return 0;
        return Math.max(getSumAlternate(root),
                        (getSumAlternate(root.left) +
                         getSumAlternate(root.right)));
    }
	public static long getSumAlternate(Node root)
    {
        if (root == null)
            return 0;

        long sum = root.data;
        if (root.left != null) {
            sum += getSum(root.left.left);
            sum += getSum(root.left.right);
        }

        if (root.right != null) {
            sum += getSum(root.right.left);
            sum += getSum(root.right.right);
        }
        return sum;
    }
	
	public static void main(String[] args) {
		String str = "3 4 5 1 3 # 1";
		System.out.println(maxSum(str,5));
	}

}
