package cracking.hackerrank;
import java.util.*;

public class Stacks_BalancedBrackets {
	public static boolean isBalancedBrackets(String str){
		Stack<Character> stack = new Stack<Character>();
		HashMap<Character,Character> bracketsMap = new HashMap<Character,Character>();
		bracketsMap.put('(', ')');
		bracketsMap.put('[', ']');
		bracketsMap.put('{', '}');
		for(char ch : str.toCharArray()){
			if(bracketsMap.containsKey(ch)){
				stack.push(ch);
			}
			else if(bracketsMap.containsValue(ch)){
				if(stack.isEmpty() || bracketsMap.get(stack.pop()) != ch){
					return false;
				}
			}
		}
		return stack.isEmpty();
	}
	public static void main(String[] args) {
		if(isBalancedBrackets("{}[](()")) System.out.println("YES");
		else System.out.println("NO");
	}

}
