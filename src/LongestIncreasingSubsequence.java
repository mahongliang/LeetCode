
public class LongestIncreasingSubsequence {

	public int lengthOfLIS(int[] nums) {
        int[] T = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
			T[i] = 1;
		}
        
        for (int i = 1; i < nums.length; i++) {
			for (int j = 0; j < i; j++) {
				if (nums[j] < nums[i]) {
					if (T[j]+1 >T[i]) {
						T[i] = T[j]+1;
					}
				}
			}
		}
        int max=0;
        for (int i = 0; i < T.length; i++) {
			if (T[i] > max) {
				max = T[i];
			}
		}
        return max;
    }
}
