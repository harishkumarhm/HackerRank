import java.util.HashSet;
import java.util.Set;


public class BSTLowestCommonAncestor {


	 
	 class Node {
	    int data;
	    Node left;
	    Node right;
	    
	 }

	static Node lca(Node root,int v1,int v2)
	    {
	    
	    if(root==null)
	        return null;
	    
	     Set<Node>  v1Path = new HashSet<Node>();
	      Set<Node> v2Path = new HashSet<Node>();
	     v1Path = searchNode(root, v1);
	     v2Path = searchNode(root, v2);
	     Node minimum = root;
	      for(Node node: v1Path)
	          {
	           if(v2Path.contains(node))
	               {
	                if(node.data<minimum.data)
	                    minimum = node;
	           }
	          
	      }
	     return minimum;
	    }
	 static Set<Node> searchNode(Node node, int val)
	     {
	       Node parent = null;
	       Node current  = node;
	       Set<Node> path = new HashSet<Node>();
	     while(true)
	            {
	              
	              path.add(current);
	              if(val==current.data)
	                  break;
	              if(val<current.data)
	                current = current.left;
	              else if(val>current.data)
	                  current = current.right;
	        }
	     return path;
	 }






}
