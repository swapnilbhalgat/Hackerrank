//http://www.geeksforgeeks.org/vertex-cover-problem-set-1-introduction-approximate-algorithm-2/

class Node{
	int data;
	Node left,right;
	public Node(int data) {
		this.data = data;
		this.left = null;
		this.right = null;
	}
	
}
public class vertexCover {

	public static int vCover(Node root){
		int inc,exc;
		
		if(root==null)
			return 0;
		if(root.left==null && root.right==null)
			return 0;
		
		inc=1+vCover(root.left)+vCover(root.right);
		
		exc=0;
		if(root.left!=null)
			exc+=1+vCover(root.left.left)+vCover(root.left.right);
		if(root.right!=null)
			exc+=1+vCover(root.right.left)+vCover(root.right.right);
		
		
		return Math.min(exc,inc);
	}
	
	public static void main(String[] args) {
		Node root=new Node(4);
		root.left=new Node(2);
		root.right=new Node(9);
		root.left.left=new Node(1);
		root.left.right=new Node(3);
		
		root.left.right.left=new Node(2);
		root.left.right.right=new Node(5);
		
		root.right.left=new Node(7);
		root.right.right=new Node(10);
	
		System.out.println("Vertex cover is "+vCover(root));

	}

}
