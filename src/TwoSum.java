
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;


public class TwoSum {
	public static void main(String[] args) {
		int[] nums = {2,7,11,15};
		int target  = 9;
		int[] result = twoSum(nums, target);
		System.out.println(result[0]+" "+result[1]);
	}
	
	//O(n^2) O(1)
//	public static int[] twoSum(int[] nums, int target){
//		int[] result = new int[2];
//		for (int i = 0; i < nums.length; i++) {
//			int temp = target - nums[i];
//			for (int j = i+1; j < nums.length; j++) {
//				if (nums[j] == temp) {
//					result[0] = i;
//					result[1] = j;
//				}
//			}
//		}
//		return result;
//	}
	
	
	//O(n) O(1)
//	public static int[] twoSum(int[] nums, int target){
//		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
//		for (int i = 0; i < nums.length; i++) {
//			map.put(nums[i], i);
//		}
//		for (int i = 0; i < nums.length; i++) {
//			int gap = target - nums[i];
//			if (map.containsKey(gap) && map.get(gap) != i) {
//				return new int[]{i, map.get(gap)};
//			}
//		}
//		throw new IllegalArgumentException("No two sum solution");
//	}
	
	//O(n) O(1)
	public static int[] twoSum(int[] nums, int target) {
	    Map<Integer, Integer> map = new HashMap<>();
	    for (int i = 0; i < nums.length; i++) {
	        int complement = target - nums[i];
	        if (map.containsKey(complement)) {
	            return new int[] { map.get(complement), i };
	        }
	        map.put(nums[i], i);
	    }
	    throw new IllegalArgumentException("No two sum solution");
	}

}
