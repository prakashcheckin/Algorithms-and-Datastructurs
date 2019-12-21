package com.dsa.ds.tree;

public class BinaryTreeTesting 
{
	class Node {
	    int value;
	    Node left;
	    Node right;
	 
	    Node(int value) {
	        this.value = value;
	        right = null;
	        left = null;
	    }
	}
	
	Node root;
	
	private Node addRecursive(Node current, int value) {
	    if (current == null) {
	        return new Node(value);
	    }
	 
	    if (value < current.value) {
	        current.left = addRecursive(current.left, value);
	    } else if (value > current.value) {
	        current.right = addRecursive(current.right, value);
	    } else {
	        // value already exists
	        return current;
	    }
	 
	    return current;
	}
	
	public void add(int value) {
	    root = addRecursive(root, value);
	}
	
	public void traverseInOrder() 
	{
		traverseInOrderInToTree(root);
	}
	
	public void traverseInOrderInToTree(Node node) 
	{
	    if (node != null) {
	    	traverseInOrderInToTree(node.left);
	        System.out.print(" " + node.value);
	        traverseInOrderInToTree(node.right);
	    }
	}

}
