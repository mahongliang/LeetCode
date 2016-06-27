package tree;

import java.util.ArrayList;
import java.util.List;

import tree.BinaryTreeLevelOrderTraversal.TreeNode;

public class PathSumII {
	public List<List<Integer>> pathSum(TreeNode root, int sum) {
		List<List<Integer>> result = new ArrayList<>();
		
		if (root == null) {
			return result;
		}
		ArrayList<Integer> path = new ArrayList<>();
		path.add(root.val);
		dfs(root, sum-root.val, path, result);
		return result;
		
	}

	public void dfs(TreeNode root, int sum, List<Integer> path, List<List<Integer>> result) {
		if (root.left == null && root.right == null && sum == 0) {
				List<Integer> newpath = new ArrayList<>(path);
				result.add(newpath);
		}	
		if (root.left != null) {
			path.add(root.left.val);
			dfs(root.left, sum-root.left.val, path, result);
			path.remove(path.size()-1);
		}
		if (root.right != null) {
			path.add(root.right.val);
			dfs(root.right, sum-root.right.val, path, result);
			path.remove(path.size()-1);
		}	
	}
}
