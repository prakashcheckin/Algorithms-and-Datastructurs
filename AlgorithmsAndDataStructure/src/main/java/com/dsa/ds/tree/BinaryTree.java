package com.dsa.ds.tree;

public class BinaryTree
{
	Node root;
	
	public Node addInToTree(Node current, int value) 
	{
		if(current == null) 
		{
			return new Node(value);
		}
		else if(value <= current.value) 
		{
			current.left = addInToTree(current.left, value);
		}
		else if(value >= current.value) 
		{
			current.right = addInToTree(current.right, value);
		}
		return current;
	}
	
	public boolean searchInToTree(Node current, int value)
	{
		
		if(current == null) 
		{
			return false;
		}
		if (current.value == value ) 
		{
			return true;
		}
		else if (value <= current.value) 
		{
			return searchInToTree(current.left, value);
		}
		else 
		{
			return searchInToTree(current.right, value);
		}
		
	} 
	
	public void traverseInOrderInToTree(Node node) 
	{
	    if (node != null) 
	    {
	    	traverseInOrderInToTree(node.left);
	        System.out.print(" " + node.value);
	        traverseInOrderInToTree(node.right);
	    }
	}
	
	public int minValueInToTree(Node current) 
	{
		if(current == null)
			return -1;
		
		if (current.left == null) 
	        return current.value;
		
	    return minValueInToTree(current.left);
	}
	
	
	public int maxValueInToTree(Node current) 
	{
		if(current == null)
			return -1;
		
		if (current.right == null) 
	        return current.value;
		
	    return maxValueInToTree(current.right);
	}
	
	public int heightOfTree(Node current) 
	{
		if(current == null) 
			return 0;
		if(current.left == null && current.right == null)
			return 0;
		int l = heightOfTree(current.left);
		int r = heightOfTree(current.right);
		return 1 + ((l > r) ? l : r);
		
	}
	
	public int NumberOfNodeInTree(Node current) 
	{
		if(current == null) 
			return 0;
		int l = NumberOfNodeInTree(current.left);
		int r = NumberOfNodeInTree(current.right);
		return 1 + l + r;
		
	}
	
	
	
	// Recursion invoking
	public void add(int value) {
		root = addInToTree(root, value);
	}
	public boolean search(int value) {
		return  searchInToTree(root, value);
	}
	public void traverseInOrder() {
		traverseInOrderInToTree(root);
	}
	public int maxValue() {
		return maxValueInToTree(root);
	}
	public int minValue() {
		return minValueInToTree(root);
	}
	public int height() {
		return heightOfTree(root);
	}
	public int numberOfNodes() {
		return NumberOfNodeInTree(root);
	}
	
	
	
	
	
	
	
	
}
