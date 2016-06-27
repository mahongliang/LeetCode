package tree;
import java.util.LinkedList;
import java.util.Queue;

public class SymmetricTree {

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	//mysolver
//	public boolean isSymmetric(TreeNode root) {
//		if (root == null) {
//			return true;
//		}
//		return isSymmetric(root.left, root.right);
//	}
//
//	public boolean isSymmetric(TreeNode left, TreeNode right) {
//		if (left != null && right != null) {
//			if (left.val == right.val && isSymmetric(left.left, right.right)
//					&& isSymmetric(left.right, right.left)) {
//				return true;
//			} else {
//				return false;
//			}
//		} else if (left == null && right == null) {
//			return true;
//		} else {
//			return false;
//		}
//	}
	
	
	
	//TC O(n)
	//OC O(n)
	public boolean isSymmetric(TreeNode root){
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		q.add(root);
		q.add(root);
		while(!q.isEmpty()){
			TreeNode t1 = q.poll();
			TreeNode t2 = q.poll();
			if (t1==null && t2 ==null) {
				continue;
			}
			if (t1 ==null || t2 ==null) {
				return false;
			}
			if (t1.val != t1.val) {
				return false;
			}
			
			q.add(t1.left);
			q.add(t2.right);
			q.add(t1.right);
			q.add(t2.left);		
		}
		return true;
	}

	
	
	//TC O(n)
	//OC O(n)
	
//	public boolean isSymmetric(TreeNode root) {
//	return isMirror(root, root);
//}
//	public boolean isMirror(TreeNode t1, TreeNode t2){
//		if (t1 == null && t2 == null) {
//			return true;
//		}
//		
//		if (t1 != null || t2 != null) {
//			return false;
//		}
//		
//		return  (t1.val == t2.val) && isMirror(t1.left, t2.right) && isMirror(t1.right, t2.left);
//	}

}
