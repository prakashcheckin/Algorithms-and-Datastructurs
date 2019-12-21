package com.dsa.ds.tree;

public class TestTree {

	public static void main(String[] args) {
	
		    BinaryTree treeMyself = new BinaryTree();
		 
		    treeMyself.add(6);
		    treeMyself.add(4);
		    treeMyself.add(8);
		    treeMyself.add(3);
		    treeMyself.add(5);
		    treeMyself.add(7);
		    treeMyself.add(9);
		 
		    treeMyself.traverseInOrder();
		    
		    System.out.println(" ");
		    
		    System.out.println("Is 5 present"+treeMyself.search(5));
		    
		    System.out.println("Max value"+ treeMyself.maxValue());
		    
		    System.out.println("Min value"+ treeMyself.minValue());
		    
		    System.out.println("Height >> " + treeMyself.height());
		    
		    System.out.println("Number of nodes >> " + treeMyself.numberOfNodes());
		    
		    
		    
		    
	}

}
