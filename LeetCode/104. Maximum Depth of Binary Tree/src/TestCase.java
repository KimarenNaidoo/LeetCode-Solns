import java.util.LinkedList;
import java.util.Queue;

public class TestCase {

TreeNode root;
	
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(){}
		TreeNode(int val) { this.val = val; }
	}
	
	
	public void push(int val) {
		TreeNode current = new TreeNode(val);
		
		if(root == null) {
			root = current;
		}
		
		else {
			TreeNode temp = root;
			
			while(temp != null) {
				if(temp.left == null) {
					temp.left = current;
					break;
				}else if (temp.right == null) {
					temp.right = current;
					break;
				}else {
					if(temp.left.left == null || temp.left.right == null) {
						temp = temp.left;
					}else if(temp.right.left == null || temp.right.right == null) {
						temp = temp.right;
					}
				}
			}
		}
	}
	
	public void push() {
		TreeNode current = new TreeNode();
		
		if(root == null) {
			root = current;
		}
		
		else {
			TreeNode temp = root;
			
			while(temp != null) {
				if(temp.left == null) {
					temp.left = current;
					break;
				}else if (temp.right == null) {
					temp.right = current;
					break;
				}else {
					if(temp.left.left == null || temp.left.right == null) {
						temp = temp.left;
					}else if(temp.right.left == null || temp.right.right == null) {
						temp = temp.right;
					}
				}
			}
		}
	}
	
	public void printTree(TreeNode value) {
		TreeNode temp = value;
		
		
		if(temp.left != null && temp.right != null) {
			System.out.println(temp.left.val);
			System.out.println(temp.right.val);
			printTree(temp.left);
			printTree(temp.right);
		}
	}
	
	public int maxDepth(TreeNode root) {
		if(root == null) return 0;
		
		Queue<TreeNode> queue = new LinkedList<>();
		queue.offer(root);
		
		int result = 0;
		while(!queue.isEmpty()) {
			int size = queue.size();
			for(int i = 0; i < size; i++) {
				TreeNode current = queue.poll();
				if(current.left != null) queue.offer(current.left);
				if(current.right != null) queue.offer(current.right);
			}
			result++;
		}
		return result;
	}

	public static void main(String[] args) {
		TestCase tree1 = new TestCase();
		
		
		tree1.push(1);
		tree1.push(2);
		tree1.push(2);
		tree1.push(3);
		tree1.push(4);
		tree1.push(4);
		tree1.push(3);
		
		System.out.print(tree1.maxDepth(tree1.root));
	}

}
