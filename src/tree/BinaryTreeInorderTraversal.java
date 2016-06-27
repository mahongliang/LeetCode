package tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import tree.BinaryTreeLevelOrderTraversal.TreeNode;

public class BinaryTreeInorderTraversal {
	public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) {
			return list;
		}
        
        Stack<TreeNode> stack = new Stack<>();
        while(true){
        	if (root != null) {
				stack.push(root);
				root = root.left;
			}else{
				if (stack.isEmpty()) {
					break;
				}
				root = stack.pop();
				list.add(root.val);
				root = root.right;		
			}
        }
        return list;
    }
}
