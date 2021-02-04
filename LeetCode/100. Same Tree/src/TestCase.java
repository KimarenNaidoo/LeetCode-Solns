
public class TestCase {

	TreeNode root;
	static boolean flag = true;
	
	public class TreeNode {
		
		int val;
		TreeNode left, right;
		
		TreeNode(){}
		
		TreeNode(int val){
			this.val = val;
		}
		
		TreeNode(int val, TreeNode left, TreeNode right){
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}
	
	public void add(int val) {
		TreeNode current = new TreeNode(val);
		
		if(root == null) { 
			root = current;
		} else {
			TreeNode temp = root;
			
			while(temp != null) {
				if(temp.left == null) {
					temp.left = current;
					break;
				}else if (temp.right == null) {
					temp.right = current;
					break;
				}else {
					temp = temp.left;
				}
			}
		}
		
	}
	
	public void add() {
		TreeNode current = new TreeNode();
		
		if(root == null) { 
			root = current;
		} else {
			TreeNode temp = root;
			
			while(temp != null) {
				if(temp.left == null) {
					temp.left = current;
					break;
				}else if (temp.right == null) {
					temp.right = current;
					break;
				}else {
					temp = temp.left;
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
	
	public static boolean isSameTree(TreeNode p, TreeNode q) {
		if((p == null && q != null) || (p != null && q == null)){
            flag = false;
        }
        
        if(p != null && q != null && p.val != q.val){
            flag = false;
        }
        
        if(p != null && q != null){
            isSameTree(p.left, q.left);
            isSameTree(p.right, q.right);
        }
        
        return flag;
	}
	
	public static void main(String[] args) {
		TestCase tree = new TestCase();
		TestCase tree1 = new TestCase();
		
		
		tree.add(1);
		tree.add(2);
		tree.add(3);
		
		tree1.add(1);
		tree1.add(2);
		tree1.add(3);
		tree1.add(3);
		
		System.out.println(isSameTree(tree.root, tree1.root));
		
	}

}
