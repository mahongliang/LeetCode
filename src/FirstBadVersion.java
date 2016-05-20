
public class FirstBadVersion {
	
	//log(n)二分查找
	
//	 public int firstBadVersion(int n) {
//		int mid;
//		int start = 1;
//		int end = n;
//		while (start <= end) {
//			mid = start + (end-start)/2;
//			if (isBadVersion(mid)) {
//				end = mid;			
//				}
//			}else {
//				start = mid+1;
//			}
//		}
//	 	return start;
//	 }
	
	//递归实现二分搜索
//	public int binarySearch(int[] arr, int start,int end, int key){
//		if (start > end) {
//			return -1;
//		}
//		
//		int mid = start +(end-start)/2;
//		if (arr[mid] > key) {
//			return binarySearch(arr, start, mid-1, key);
//		}
//		if (arr[mid] < key) {
//			return binarySearch(arr, mid+1, end, key);
//		}
//		
//		return mid;
//	}
	
	public int binarySearch(int[] arr, int start,int end, int key){
		int mid;
		while(start <=end){
			mid = start + (end-start)/2;
			if (arr[mid] > key) {
				end = mid - 1;
			}else if(arr[mid] < key){
				start = mid+1;
			}else {
				return mid;
			}		
		}
		
		return -1;
	}
}
