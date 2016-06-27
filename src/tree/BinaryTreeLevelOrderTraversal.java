package tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;






public class BinaryTreeLevelOrderTraversal {
	 class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode(int x) { val = x; }
	 }
	 public List<List<Integer>> levelOrder(TreeNode root) {
		 Queue<TreeNode> queue = new LinkedList<>();
		 ArrayList<List<Integer>> result = new ArrayList<>();
		 if (root == null) {
			return result;
		}
		 queue.offer(root);
		 while(!queue.isEmpty()){
			 ArrayList<Integer> level = new ArrayList<>();
			 int size = queue.size();
			 for (int i = 0; i < size; i++) {
				TreeNode head = queue.poll();
				level.add(head.val);
				if (head.left!= null) {
					queue.offer(head.left);
				}
				if (head.right != null) {
					queue.offer(head.right);
				}
			}
			 result.add(level);
		 }
		 return result;
	 }
}
