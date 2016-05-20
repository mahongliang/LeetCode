import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;


public class LongestSubstringWithoutRepeatingCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(lengthOfLongestSubstring("pwwkew"));
	}
	
	//solver
//	public static int lengthOfLongestSubstring(String s) {
//        
//        int max = 0;
//        int curmax = 0;
//        for (int i = 0; i < s.length(); i++) {
//        	curmax = 0;
//        	HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
//			for (int j = i; j < s.length(); j++) {
//				int ch = s.charAt(j);
//				if (!map.containsKey(ch)) {				
//					curmax++;
//					map.put(ch, curmax);
//					if (curmax > max) {
//						max = curmax;
//					}
//				}else {
//					break;
//				}
//			}
//		}
//        return max;
//    }
	
	//TC O(n)
//	public static int lengthOfLongestSubstring(String s){
//		int n =s.length();
//		Set<Character> set = new HashSet<Character>();
//		int ans = 0,i=0,j=0;
//		while( i< n && j<n){
//			if (set.contains(s.charAt(j))) {
//				set.add(s.charAt(j++));
//				ans = Math.max(ans, j-i);
//			}else {
//				set.remove(s.charAt(i++));
//			}
//		}
//		return ans;
//	}
//	public static int lengthOfLongestSubstring(String s){
//		int n=s.length(),ans=0;
//		Map<Character, Integer> map = new HashMap<>();
//		for (int j = 0,i=0; j < n; j++) {
//			if (map.containsKey(s.charAt(j))) {
//				i = Math.max(map.get(s.charAt(j)), i);
//			}
//			ans = Math.max(ans, j-i+1);
//			map.put(s.charAt(j), j+1);
//		}
//		return ans;
//	}
	
	public static int lengthOfLongestSubstring(String s){
		int n=s.length(),ans=0;
		int[] index = new int[128];
		for (int j = 0 , i=0; j < index.length; j++) {
			i = Math.max(index[s.charAt(j)], i);
			ans = Math.max(ans, j-i+1);
			index[s.charAt(j)]=j+1;
		}
		return ans;
	}
	
	
	//穷举 用i,j代表字符串的起始和结束位置TC  O(n^3)  SC O(min(m,n))
	
	
//	 public int lengthOfLongestSubstring(String s) {
//	        int n = s.length();
//	        int ans = 0;
//	        for (int i = 0; i < n; ++i)
//	            for (int j = i + 1; j <= n; ++j)
//	                if (allUnique(s, i, j)) ans = Math.max(ans, j - i);
//	        return ans;
//	    }
//
//	    public boolean allUnique(String s, int start, int end) {
//	        Set<Character> set = new HashSet<>();
//	        for (int i = start; i < end; ++i) {
//	            Character ch = s.charAt(start);
//	            if (set.contains(ch)) return false;
//	            set.add(ch);
//	        }
//	        return true;
//	    }
//	}
}
