
public class PowerofThree {
	
	//递归
//	  public boolean isPowerOfThree(int n) {
//		if (n <= 0)
//			return false;
//		if (n == 1)
//			return true;
//		
//		if (n % 3 == 0) {
//			return isPowerOfThree(n / 3);
//		} else {
//			return false;
//		}
//	  }
	
	//循环
//	public boolean isPowerOfThree(int n){
//		while (n > 1) {
//			if (n % 3 == 0) {
//				n = n/3;
//			}else {
//				return false;
//			}			
//		}
//		return n==1;
//	}
	
//	public boolean isPowerOfThree(int n){
//		return (Math.log10(n)/Math.log10(3))%1 == 0;
//	}
	

	//1162261467 3的最大次数19次
	public boolean isPowerOfThree(int n) {
        return n > 0 && 1162261467 % n == 0;
    }
	

	public static void main(String[] args) {
		if (((1.3/1.3)%1)== 0) {
			System.out.println("1.2/1.2=1");
		}else {
			System.out.println("1.2/1.2!=1");
		}
		
	}
	
	
}
