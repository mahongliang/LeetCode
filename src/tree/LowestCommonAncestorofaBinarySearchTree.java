package tree;

import tree.BinaryTreeLevelOrderTraversal.TreeNode;

public class LowestCommonAncestorofaBinarySearchTree {

	 public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		 if (root == null) {
			return null;
		}
		 
		 if (root == p || root == q) {
			return root;
		}
		 
		if (root.val > Math.max(p.val, q.val)) {
			return lowestCommonAncestor(root.left, p, q);
		}else if (root.val < Math.min(p.val, q.val)) {
			return lowestCommonAncestor(root.right, p, q);
		}
		
		return root;
		
	 }
}
