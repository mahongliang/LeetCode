import java.util.Arrays;


public class ValidAnagram {
	
	//myslover
//	 public boolean isAnagram(String s, String t) {
//		 
//		 	if (s.length() != t.length()) {
//				return false;
//			}
//	        int[] cnt = new int[26];
//	        for (int i = 0; i < s.length(); i++) {
//				cnt[s.charAt(i)-'a']++;
//			}
//	        for (int i = 0; i < t.length(); i++) {
//	        	cnt[t.charAt(i)-'a']--;	        	
//				if (cnt[t.charAt(i)-'a'] < 0 ) {
//					return false;
//				}
//			}
//	 
//	        return true;
//	 }
	
	//TC O(nlogn)
	//SC O(1)
	public boolean isAnagram(String s, String t){
		if (s.length() != t.length()) {
			return false;
		}
		
		char[] a = s.toCharArray();
		char[] b = t.toCharArray();
		Arrays.sort(a);
		Arrays.sort(b);
		return Arrays.equals(a,b);
	}
	
}
