import java.util.LinkedList;
import java.util.Queue;


public class InvertBinaryTree {

	class TreeNode {
		     int val;
		     TreeNode left;
		     TreeNode right;
		     TreeNode(int x) { val = x; }
	}
	
	//mysolver
//	public TreeNode invertTree(TreeNode root) {
//		
//		 if(root == null) return null;
//	        Queue<TreeNode> q = new LinkedList<TreeNode>();
//			TreeNode headNode = root;
//			q.add(root);
//			while (!q.isEmpty()) {
//				TreeNode node = q.remove();
//				
//				 if (node.left != null || node.right != null) {
//						TreeNode temp = node.left;
//						node.left = node.right;
//						node.right = temp;
//						if(node.left !=null)
//						    q.add(node.left);
//						if(node.right !=null)
//				            q.add(node.right);
//				}
//						
//			}
//			return headNode;
//    }
	
	//递归 TC O(n)
	//OC O(n)
//	public TreeNode invertTree(TreeNode root) {
//		if (root == null) {
//			return null;
//		}
//		
//		TreeNode right = invertTree(root.right);
//		TreeNode left = invertTree(root.left);
//		root.right = left;
//		root.left = right;
//		
//		return root;
//	}
//	
	//遍历 TC O(n)
	//OC O(n)
	public TreeNode invertTree(TreeNode root) {
		if (root == null) {
			return null;
		}
		Queue<TreeNode> q = new LinkedList<InvertBinaryTree.TreeNode>();
		q.add(root);
		while (!q.isEmpty()) {
			TreeNode current = q.remove();
			TreeNode temp = current.left;
			current.left = current.right;
			current.right = temp;
			if (current.left != null) {
				q.add(current.left);
			}
			if (current.right != null) {
				q.add(current.right);
			}
			
		}
		return root;
	}
}
