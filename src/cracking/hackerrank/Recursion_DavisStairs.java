package cracking.hackerrank;

public class Recursion_DavisStairs {

	public static void main(String[] args) {
		System.out.println(countWaysRec(5));
		System.out.println(countWaysMemo(5));
		System.out.println(countWaysMemo(5));
	}
	public static int countWaysRec(int steps){
		if(steps < 0) return 0;
		else if(steps == 0) return 1;
		return countWaysRec(steps - 1) + countWaysRec(steps - 2) + countWaysRec(steps - 3);
	}
	public static int countWaysMemo(int steps){
		return countWaysMemoHelper(steps,new int[steps + 1]);
	}
	public static int countWaysMemoHelper(int steps,int [] memo){
		if(steps < 0) return 0;
		else if(steps == 0) return 1;
		if(memo[steps] == 0){
			memo[steps] = countWaysMemoHelper(steps - 1,memo) + countWaysMemoHelper(steps - 2,memo) +countWaysMemoHelper(steps - 3, memo);
		}
		return memo[steps];
	}
}
