package cracking.hackerrank;

public class DP_CoinChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static long makeCoinChange(int [] coinDenomination,int money){
		long [] dp = new long[(int)money + 1];
		dp[0] = 1;
		for(int denomination : coinDenomination){
			for(int j = 1; j <= money; ++ j){
				if(j >= denomination){
					dp[j] = dp[j] + dp[(int)j - denomination]; 
				}
			}
		}
		return dp[(int)money];
	}
	
	long makeChange(int [] coins,int money,int index){
		if(money == 0) return 1;
		if(coins.length <= index) return 0;
		int amountDoneWithCoins = 0;
		long ways = 0;
		while(amountDoneWithCoins <= money){
			int remaining = money - amountDoneWithCoins;
			ways += makeChange(coins,remaining,index + 1);
			amountDoneWithCoins += coins[index];
		}
		return ways;
	}
	
}
