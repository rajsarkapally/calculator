package calculator;

public class BST {
	class Node{
		int value;
		Node left, right;
	}

	public void preOrder(Node n) {
		if(n != null) {
			System.out.println(n.value);
			preOrder(n.left);
			preOrder(n.right);
		}
	}

	public void postOrder(Node n) {
		if(n != null) {
			preOrder(n.left);
			preOrder(n.right);
			
			System.out.println(n.value);
		}
		
	}
}
