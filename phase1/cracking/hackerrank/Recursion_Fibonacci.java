package cracking.hackerrank;
import java.util.*;
public class Recursion_Fibonacci {

	public static void main(String[] args) {
		System.out.println(fibonacciNumberRecursion(10));
		System.out.println(fibonacciNumberIteration(10));
		for(int num : fibonacciSeriesIterative(10)){
			System.out.print(num+" ");
		}
		System.out.println();
		for(int num : fibonacciSeriesUptoMax(540)){
			System.out.print(num+" ");
		}
	}
	public static int fibonacciNumberRecursion(int n){
		if (n < 0) return -1;
		return (n > 2) ? fibonacciNumberRecursion(n - 1) + fibonacciNumberRecursion(n - 2) : 1;
	}
	public static int fibonacciNumberIteration(int n){
		if(n < 0) return -1;
		int x = 0, y = 1, sum = 0, count = 2;
		while(count <= n){
			sum = x + y;
			x = y;
			y = sum;
			++ count;
		}
		return sum;
	}
	public static int [] fibonacciSeriesIterative(int n){
		if(n < 0) return new int[] {};
		int [] dp = new int[n];
		dp[0] = 0;
		int x = 0, y = 1, sum = 0, count = 2;
		while(count <= n){
			sum = x + y;
			x = y;
			y = sum;
			dp[count - 1] = sum;
			++ count;
		}
		return dp;
	}
	public static int [] fibonacciSeriesUptoMax(int max){
		if(max < 0) return new int [] {};
		List<Integer> list = new ArrayList<Integer>();
		list.add(0);
		int x = 0, y = 1, sum = 0, count = 2;
		while(count <= max){
			sum = x + y;
			x = y;
			y = sum;
			if(sum > max) break;
			list.add(sum);
			++ count;
		}
		int [] result = new int[list.size()];
		result[0] = 0;
		for(int i = 1; i < result.length; ++ i){
			result[i] = list.get(i);
		}
		return result;
	}
}
