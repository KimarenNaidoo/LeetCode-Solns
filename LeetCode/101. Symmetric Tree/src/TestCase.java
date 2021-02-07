
public class TestCase {

	TreeNode root;
	
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
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
	
	public void printTree(TreeNode value) {
		TreeNode temp = value;
		
		
		if(temp.left != null && temp.right != null) {
			System.out.println(temp.left.val);
			System.out.println(temp.right.val);
			printTree(temp.left);
			printTree(temp.right);
		}
	}
	
	public boolean isSymmetrical(TreeNode root) {
		
		if(root == null) return true;
		
		if(root.left == null && root.right == null) return true;
		
		if(root.left != null && root.right != null) {
			return helper(root.left, root.right);
		}
		return false;
	}
	
	public boolean helper(TreeNode left, TreeNode right) {
		
		if(left == null && right == null) {
			return true;
		}
		
		if(left == null || right == null || left.val != right.val) {
			return false;
		}
		
		if(helper(left.left, right.right) && helper(left.right, right.left)) {
			return true;
		}
		return false;
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
		

		
		System.out.println(tree1.isSymmetrical(tree1.root));

	}

}
