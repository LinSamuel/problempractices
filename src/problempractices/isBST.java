package problempractices;

public class isBST {
    class Node {
        int data;
        Node left;
        Node right;
     }
    
    public boolean subtreeLesser(Node root, int data){
    	if (root == null) {
    		return true;
    	}
    	if (root.data < data && subtreeLesser(root.left, data) && subtreeLesser(root.right, data)){
    		return true;
    	} else {
    		return false;
    	}
    }
    
    public boolean subtreeGreater(Node root, int data){
    	if (root == null) {
    		return true;
    	}
    	if (root.data > data && subtreeGreater(root.left, data) && subtreeGreater(root.right, data)){
    		return true;
    	} else {
    		return false;
    	}
    }
    
    public boolean checkBST(Node root){
    	if (root == null) {
    		return true;
    	}
    	if (subtreeLesser(root.left, root.data) && 
    			subtreeGreater(root.right, root.data) && 
    			checkBST(root.left) && checkBST(root.right)){
    		return true;
    	} else {
    		return false;
    	}
    }
    
	public static void main(String[] args) {
		return;

	}

}
