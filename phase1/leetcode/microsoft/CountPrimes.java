package leetcode.microsoft;


public class CountPrimes {

	public static void main(String[] args) {
		System.out.println(countPrimesOptimized(20));
	}
	
	// keep a boolean array considering all numbers to be prime, 
	// starting from 2, if i is prime(marked as false) put all its multiples till n as true(non prime) 
	// continue for all the numbers till n
	
	public static int countPrimesOptimized(int n){
		int noOfPrimes = 0;
		boolean [] notPrimes = new boolean[n];
		for(int i = 2; i < n; ++ i){
			if(!notPrimes[i]){ // if true means it is prime
				noOfPrimes ++;
				for(int j = 2; i * j < n; ++ j){
					notPrimes[i * j] = true;
				}
			}
		}
		return noOfPrimes;
	}
}
