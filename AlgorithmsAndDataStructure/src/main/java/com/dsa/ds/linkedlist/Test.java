package com.dsa.ds.linkedlist;

public class Test {

	public static void main(String[] args) {
		
		LinkedList list = new LinkedList();
		
		list.insert(5);
		list.insert(15);
		list.insert(25);
		list.insert(35);

	/*	list.insertAtFirst(1);
		list.insertAtPostion(4, 100); 
		list.delete();
		list.deleteAtFirst();
		list.deleteAtPosition(60);
		*/
		//list.swapFirstLast();
		//list.show();
		
		//System.out.println("List Size >>" + list.length());
		
		list.recursiveInitiate();
		System.out.println("Reverse done");
		list.show();
		

	}

}
