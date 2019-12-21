package com.dsa.ds.graph;

import java.util.HashMap;
import java.util.LinkedList;

public class Graph {
	
	private HashMap<Node, LinkedList<Node>> adjacencyMap; 
	private boolean directed;
	
	public Graph(boolean directed) 
	{
		this.directed = directed;
		 adjacencyMap = new HashMap<Node, LinkedList<Node>>();
	}
	
	public void addEdge(Node source, Node destination) 
	{
		//check source is present, if not put it into map
		if(!adjacencyMap.keySet().contains(source)) 
		{
			adjacencyMap.put(source, null);
		}
		
		if(!adjacencyMap.keySet().contains(destination)) 
		{
			adjacencyMap.put(destination, null);
		}
		
		addEdgeHelper(source, destination);
		
		// If a graph is undirected, we want to add an edge from destination to source as well
		if (!directed)
		{
			addEdgeHelper(destination, source);
		}
	}
	
	
	public void addEdgeHelper(Node source, Node destination) 
	{
		 LinkedList<Node> tmp  = adjacencyMap.get(source);
		 
		 if(tmp != null) 
			 tmp.remove(destination);
		 else
			 tmp = new LinkedList<Node>();
		
		 tmp.add(destination);
		 adjacencyMap.put(source,tmp);
	}
	
	
	public void printEdges() 
	{
	    for (Node node : adjacencyMap.keySet()) 
	    {
	        System.out.print("The " + node.name + " has an edge towards: ");
	        
	        if(null != adjacencyMap.get(node)) 
	        {
	        	for (Node neighbor : adjacencyMap.get(node)) {
		            System.out.print(neighbor.name + " ");
		        }
		        System.out.println();
	        }else 
	        {
	        	System.out.println("empty");
	        }
	    }
	}
	
	public boolean hasEdge(Node source, Node destination) 
	{
	    return adjacencyMap.containsKey(source) && adjacencyMap.get(source).contains(destination);
	}
	
	
	
	
}
