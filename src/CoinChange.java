import java.util.Arrays;

public class CoinChange {
	
	public int coinChange(int[] coins, int amount) {
		int[] dp = new int[amount+1];
		Arrays.fill(dp, amount+1);
		dp[0]=0;
		for (int i = 1; i <= amount; i++) {
			for (int j = 0; j < coins.length; j++) {
				if (coins[j] <=i) {
					dp[i] = Math.min(dp[i], dp[i-coins[j]]+1);
				}
				
			}
		}
		
		return dp[amount] > amount ? -1 : dp[amount];
	}
	
	int a;
	void count(int a){
		this.a = a;
	}
	
	public static void main(String[] args) {
		CoinChange change = new CoinChange();
		change.count(17);
		System.out.println(change.a);
		
	}	
}
class Task implements  Runnable {
	public void run() {	
		while(true){
			System.out.println("Hello Task");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
