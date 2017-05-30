public class CheckBST {
	Node prev = null;
	public class Node {
		int data;
		Node left;
		Node right;
		 public Node(int item)
		    {
		        data = item;
		        left = right = null;
		    }
	}
	
	
	
	public boolean isBST(Node node)
	{
		if(node==null)
			return true;
		
			if(!isBST(node.left))
				return false;
			 
			 if(prev!=null && node.data<=prev.data)
				 return false;
			 prev = node;
			 return isBST(node.right);
		
	}
	
	 /* Driver program to test above functions */
    public static void main(String args[])
    {
    	Node root;
    	CheckBST bst = new CheckBST();
    	root = bst.new Node(4);
    	root.left = bst.new Node(2);
    	root.right = bst.new Node(5);
    	root.left.left = bst.new Node(1);
    	root.left.right = bst.new Node(3);
 
        if (bst.isBST(root))
            System.out.println("IS BST");
        else
            System.out.println("Not a BST");
    }

}
