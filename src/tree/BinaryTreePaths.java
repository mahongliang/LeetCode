package tree;

import java.util.ArrayList;
import java.util.List;

import tree.BinaryTreeLevelOrderTraversal.TreeNode;

public class BinaryTreePaths {

	public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<String>();
        if (root == null) {
			return result;
		}
        dfs(root, result, ""+root.val);
        return result;
        
    }
	
	public void dfs(TreeNode root, List<String> result, String cur){
		
		if (root.left == null && root.right==null) {
			result.add(cur);
			return;
		}
		if (root.left !=null) {
			dfs(root.left, result, cur+"->"+root.left.val);
		}
		if (root.right !=null) {
			dfs(root.right, result, cur+"->"+root.right.val);
		}
	}
}
