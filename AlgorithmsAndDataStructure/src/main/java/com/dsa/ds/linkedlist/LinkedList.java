package com.dsa.ds.linkedlist;

public class LinkedList {
	
	Node head;
	int listSize;
	
	public void insert(int data) 
	{
		Node newNode = new Node(data);
		
		if(listSize == 0)
		{
			head = newNode;
			listSize++;
			return;
		}
		Node temp;
		temp = head;
		
		for(int i = 1; i < listSize; i++) 
		{
			temp = temp.next;
		}
		
		temp.next = newNode;
		listSize++;
	}
	
	public void insertAtFirst(int data) 
	{
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
		listSize++;
	}
	
	
	public void insertAtPostion(int position, int data) 
	{
		
		if (position == 0) 
		{
			Node newNode = new Node(data);
			newNode.next = head;
			head = newNode;
			listSize++;
			return;
		}
		
		if(position > 0 && position <= listSize) 
		{
			Node newNode = new Node(data);
			Node temp = head;
			Node prev = null;
			
			for (int i=1; i < position; i++) 
			{
				prev = temp;
				temp = temp.next;
			}
			
			prev.next = newNode;
			newNode.next = temp;
			listSize++;
			return;
		}
		
		System.out.println("Incorrect postion");
		
	}
	
	public void deleteAtFirst() 
	{
		if(listSize > 0) 
		{
			Node temp = head;
			head = temp.next;
			listSize--;
			return;
		}
		System.out.println("List is empty");
	}
	
	public void delete() {
		
		if(listSize > 0) 
		{
			Node temp = head;
		
			for(int i=1; i < listSize-1; i++)
			{
				temp = temp.next;
			}
			temp.next = null;
			listSize--;
			return;
		}
		System.out.println("List is empty");
	}
	
	public void deleteAtPosition(int position) 
	{
		Node temp = head;
		
		if(listSize <= 0) 
		{
			System.out.println("List is empty");
			return;
		}
		
		if( position == 0 ) 
		{
			deleteAtFirst();
			return;
		}
		
		if(position == listSize) 
		{
			delete();
			return;
		}
		
		if(position > 0 && position < listSize) 
		{
			Node prev = null;
			
			for (int i=1; i < position; i++) 
			{
				prev = temp;
				temp = temp.next;
			}
			
			prev.next = temp.next;
			listSize--;
			return;
		}
		System.out.println("Incorrect position");
	}
	
	
	public int length() 
	{
		return this.listSize; 
	}
	
	public void swapFirstLast() 
	{
		if(listSize > 1) 
		{
			Node temp = head;
			Node first = head;
			
			for(int i = 1; i < listSize-1; i++) 
			{
				temp = temp.next;
			}
			
 			Node last = temp.next;
			temp.next = first;
			last.next = head.next;
			head = last;
			first.next = null;
		}
	}
	
	public void show() 
	{
		Node temp=head;
		
		for(int i = 1; i <= listSize; i++) 
		{
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
	
	public void recursiveInitiate() {
		
		//printElementUsingRecursive(head);
		//printElementInReverseUsingRecursive(head);
		 //head = ReverseListUsingIterative(head);
		 ReverseListUsingRecursive(null,head);
	}
	
	public void printElementUsingRecursive(Node next) 
	{
		Node temp = next;
		if(temp != null)
		{
			System.out.println("Using recursive from top to bottom >>"+temp.data);
			printElementUsingRecursive(temp.next);
		}
	}
	
	public void printElementInReverseUsingRecursive(Node next) 
	{
		Node temp = next;
		if(temp != null)
		{
			printElementInReverseUsingRecursive(temp.next);
			System.out.println("Using recursive from bottom to top >>"+temp.data);
		}
	}
	
	public Node ReverseListUsingIterative(Node head) 
	{
		Node prev = null;
		Node curnt = head;
		Node nextNode = null;
		
		while(curnt != null) 
		{
			nextNode = curnt.next;
			curnt.next = prev;
			prev = curnt;
			curnt = nextNode;
		}
		return prev;
	}
	
	public void ReverseListUsingRecursive(Node prev, Node current) 
	{
		if(current != null) 
		{
			ReverseListUsingRecursive(current, current.next);
			current.next = prev;
		}else 
		{
			head = prev;
		}
	}
}


