
public class RemoveElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums={3,2,2,3};
		int val = 3;
		System.out.println(removeElement(nums,val));
	}
	
	//two pointer	
	//TC O(n)
	//OC O(1)
//	public static int removeElement(int[] nums, int val){
//		int i=0;
//		for (int j = 0; j < nums.length; j++) {
//			if (nums[j] != val) {
//				nums[i]=nums[j];
//				i++;
//			}
//		}
//		return i;
//	}
	
	
	//TC O(n)
	//OC O(1)
	public static int removeElement(int[] nums, int val){
		int i=0;
		int n = nums.length;
		while(i<n){
			if (nums[i] == val) {
				nums[i]=nums[n-1];
				n--;
			}else {
				i++;
			}
		}
		return n;
	}
	
	

	//mysolver
//	public static int removeElement(int[] nums, int val) {
//		int cnt=0;
//	     for (int i = 0; i < nums.length-cnt;) {
//			if (nums[i] == val) {
//				cnt++;
//				
//				for (int j = i; j < nums.length-cnt; j++) {
//					nums[j] = nums[j+1];
//				}
//				i=0;
//			}else {
//				i++;
//			}
//		}   
//	     
//	    return nums.length-cnt;
//	}

}
