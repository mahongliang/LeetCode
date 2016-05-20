public class Numberof1Bits {

	
	//mysolver
//	public static int hammingWeight(int n) {
//		int cnt = 0;
//		for (int i = 0; i < 32; i++) {
//			if ((n & 0x01) == 1) {
//				cnt++;
//			}
//			n = n>>1;
//		}
//		return cnt;
//	}
	
	public static int hammingWeight(int n){
		int sum = 0;
		while(n != 0){
			sum++;
			n &= (n-1);//important
		}
		return sum;
	}
	public static void main(String[] args) {
		System.out.println(hammingWeight(11));
	}
}
