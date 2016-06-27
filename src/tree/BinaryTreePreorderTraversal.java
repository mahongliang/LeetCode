package tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import tree.BinaryTreeLevelOrderTraversal.TreeNode;

public class BinaryTreePreorderTraversal {
	public List<Integer> preorderTraversal(TreeNode root) {
		List<Integer> list = new ArrayList<>();
        if (root==null) {
			return list;
		}
        
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()){
        	root = stack.pop();
        	list.add(root.val);
        	if (root.right != null) {
				stack.push(root.right);
			}
        	if (root.left != null) {
        		stack.push(root.left);
			}
        }
        
        return list;
    }
}
