package cracking.hackerrank;

class Tree{
	int value;
	Tree left,right;
	Tree(int value)
	{
		this.value = value;
		left = right = null;
	}
}
public class IsABSTree {
	boolean isABinarySearchTree(Tree root){
		return isABinaryTreeHelper(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
	}
	boolean isABinaryTreeHelper(Tree current,int lowerBound,int upperBound){
		if(current == null) return true;
		else if(current.value < upperBound && current.value > lowerBound && isABinaryTreeHelper(current.left,lowerBound,current.value) && isABinaryTreeHelper(current.right,current.value,upperBound)){
			return true;
		}
		else{
			return false;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
