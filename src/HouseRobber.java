
public class HouseRobber {

	//{3,2,1,5}
	//dp[0]=3
	//dp[1]=3
	//dp[2]=max(dp[0]+1,dp[1])
	public int rob(int[] nums){
		
		if(nums.length == 0) return 0;
		if(nums.length == 1) return nums[0];
		int[] dp = new int[nums.length];
		dp[0] = nums[0];
		dp[1] = Math.max(dp[0], nums[1]);
		for (int i = 2; i < nums.length; i++) {
			dp[i] = Math.max(dp[i-2]+dp[i], dp[i-1]);
		}
		return dp[nums.length-1];
	}
}
