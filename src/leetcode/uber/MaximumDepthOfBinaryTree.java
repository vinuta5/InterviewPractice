/*
 Maximum depth of a binary tree should be the sum of depth of current node(which is 1)  
  + Maximum of depth of left or right nodes
 */



package leetcode.uber;
class TreeNode{
	int val;
	TreeNode left,right;
	TreeNode(int val){
		this.val = val;
	}
}
public class MaximumDepthOfBinaryTree {

	public static void main(String[] args) {
	}
	public int maximumDepth(TreeNode root){
		if(root == null) return 0;
		return 1 + Math.max(maximumDepth(root.left) ,maximumDepth(root.right));
	}
}
