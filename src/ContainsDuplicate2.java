import java.util.HashMap;
import java.util.Map;


public class ContainsDuplicate2 {

	//超时穷举法
//	public boolean containsNearbyDuplicate(int[] nums, int k) {
//        for (int i = 0; i < nums.length; i++) {
//			for (int j = i+k; j < nums.length; j++) {
//				if (nums[i] == nums[k]) {
//					return true;
//				}
//			}
//		}      
//        return false;
//    }
	
	public static void main(String[] args) {
		int[] nums = {1,0,1,1};
		if (containsNearbyDuplicate(nums, 1)) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
	}
	
	public static boolean containsNearbyDuplicate(int[] nums, int k) {
		if(nums.length < 2) {
			return false;
		}
		
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();  
		
		for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(nums[i])) {
				int j = map.get(nums[i]);
				if (i - j <= k) {
					return true;
				}
			}
				
			map.put(nums[i], i);  
			
		}
		return false;
	}
}
