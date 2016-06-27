package tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import tree.BinaryTreeLevelOrderTraversal.TreeNode;

public class BinaryTreePostorderTraversal {
	public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root==null) {
			return list;
		}
        
        Stack<TreeNode> stack = new Stack<>();
        Stack<TreeNode> stack1 = new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()){
        	root = stack.pop();
        	stack1.push(root);
        	if (root.left != null) {
				stack.push(root.left);
			}
        	if (root.right !=null) {
				stack.push(root.right);
			}
        }
        
        while(!stack1.isEmpty()){
        	root = stack1.pop();
        	list.add(root.val);
        }
        return list;
    }
}
