package com.dsa.sorting;

import java.util.Arrays;


/*Time complexity: order of n^2*/
public class BubbleSort {

	public static void main(String[] args) {
		
		int a[] = {2, 1, 10, 7, 8, 9};
		bubbleSort(a, a.length);
	}
	
	public static void bubbleSort(int a[], int n) {
		
		for(int k=0; k < n-1; k++) 
		{
			int flag = 0;
			for(int i=0; i < n-1; i++) 
			{
				if(a[i] > a[i+1]) 
				{
					int temp = a[i];
					a[i] = a[i+1];
					a[i+1]= temp;
					
					flag = 1;
				}
			}
			if(flag == 0) 
				break;
		}
		
		System.out.println(Arrays.toString(a));
	}
}
