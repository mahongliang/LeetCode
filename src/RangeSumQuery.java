import java.util.HashMap;
import java.util.Map;

public class RangeSumQuery {

//	private int[][] sums;
//
//	public RangeSumQuery(int[] nums) {
//		sums = new int[nums.length][nums.length];
//		int sum = 0;
//		for (int i = 0; i < nums.length; i++) {
//			sum = 0;
//			for (int j = i; j < nums.length; j++) {
//				sum += nums[j];
//				sums[i][j] = sum;
//			} 		
//		}
//	}
//
//	public int sumRange(int i, int j) {
//		
//		return sums[i][j];
//	}
	
//	private Map<Pair<Integer, Integer>, Integer> map = new HashMap<>();
//
//	public RangeSumQuery(int[] nums) {
//	    for (int i = 0; i < nums.length; i++) {
//	        int sum = 0;
//	        for (int j = i; j < nums.length; j++) {
//	            sum += nums[j];
//	            map.put(Pair.create(i, j), sum);
//	        }
//	    }
//	}
//
//	public int sumRange(int i, int j) {
//	    return map.get(Pair.create(i, j));
//	}
//	
	
	//动态规划
	
	private int[] sums;
	public RangeSumQuery(int[] nums){
		sums = new int[nums.length+1];
		for (int i = 0; i < nums.length; i++) {
			sums[i+1] = sums[i]+nums[i];
		}
	}
	
	public int sumRange(int i, int j){
		return sums[j+1]-sums[i];
	}
}
