package tree;

import java.util.LinkedList;
import java.util.Queue;

import tree.BinaryTreeLevelOrderTraversal.TreeNode;

public class MinimumDepthofBinaryTree {

	 public int minDepth(TreeNode root) {
		 if (root == null) {
			return 0;
		 }
		 Queue<TreeNode> queue = new LinkedList<>();
		 int min=0;
		 queue.offer(root);
		 while(!queue.isEmpty()){
			 int size = queue.size();
			 min++;
			 for (int i = 0; i < size; i++) {
				 TreeNode head = queue.poll();
				 if (head.left == null && head.right==null) {
					return min;
				}
				 if (head.left != null) {
					queue.offer(head.left);
				}
				 
				 if (head.right != null) {
					queue.offer(head.right);
				}			
			} 
		 }
		 return min;		 	 
	 }
}
