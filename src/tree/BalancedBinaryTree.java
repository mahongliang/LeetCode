package tree;



import tree.BinaryTreeLevelOrderTraversal.TreeNode;

public class BalancedBinaryTree {
	public boolean isBalanced(TreeNode root) {
        if (root==null) {
			return true;
		}
        
        int left = depth(root.left);
        int right = depth(root.right);
        if (Math.abs(left-right)>1) {
        	return false;
		}
        return isBalanced(root.left)&&isBalanced(root.right);
        
    }
	
	public int depth(TreeNode root){
		if (root == null) {
			return 0;
		}
		int left = depth(root.left);
		int right = depth(root.right);
		
		return Math.max(left, right)+1;
	}
}
