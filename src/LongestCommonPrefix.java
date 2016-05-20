
public class LongestCommonPrefix {

	//OT O(S=m*n总的字符数)
	//OC O(1)
	public String longestCommonPrefix(String[] strs) {
		if (strs.length <1) {
			return "";
		}
		StringBuffer sb = new StringBuffer();
        for (int i = 0; i < strs[0].length(); i++) {
			if (isSame(strs, i)) {
				sb.append(strs[0].charAt(i));
			}else {
				break;
			}
		}
        return sb.toString();
    }
	public boolean isSame(String[] strs, int index){
		char ch = strs[0].charAt(index);
		for (int i = 1; i < strs.length; i++) {
			if (index >= strs[i].length()||strs[i].charAt(index) != ch) {
				return false;
			}
		}
		return true;
	}
}
