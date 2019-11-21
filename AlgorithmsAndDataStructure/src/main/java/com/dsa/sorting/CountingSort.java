package com.dsa.sorting;

import java.util.Arrays;

/*Prefer count sort only for small range element even negative range elements*/

/*Time Complexity : Totally 3 n for loop and 1 k for loop
 O(3n + k)  that is O(n+k);
 n -> n loop iteration;
 k -> k loop iteration;

Space Complexity: O(n+k)
n -> output array size;
k -> count array size*/

class CountingSort 
{ 

	// Driver code 
	public static void main(String[] args) 
	{ 
		int a[] = {2, 1, 6, 5, 8, 3, 12, 4, 18, 11, -5, -10, 0, -3};

		countSort(a, a.length);
		System.out.println(Arrays.toString(a));
		
		int b[] = {2, 1, 6, 0 };
		countSortExample(b, b.length);
		System.out.println(Arrays.toString(b));
	}
	
	public static void countSort(int[] a, int n) {
		
		int min = Arrays.stream(a).min().getAsInt();
		int max = Arrays.stream(a).max().getAsInt();
		
		int k = max - min + 1;
		
		int[] output = new int[n];
		int[] count = new int[k];
		
		//
		for(int i=0; i < n; i++) {
			count[a[i] - min]++;
		}
		
		for(int i=1; i < k; i++) {
			count[i] = count[i] + count[i - 1];
		}
		
		for(int i=n-1; i >=0; i--) {
			output[--count[a[i] - min]] = a[i];
		}
		
		for(int i=0; i<n; i++) {
			a[i] = output[i];
		}
		
	}
	
	
	/*This method is only for understanding puropose. this method won't work for negative elements 
	and also for positive element array which don't have zero element in input array.*/	
	public static void countSortExample(int[] a, int n) {
		
		int min = Arrays.stream(a).min().getAsInt();
		int max = Arrays.stream(a).max().getAsInt();
		
		// Calculate number of element present between min and max. Eg min=0 & max =5 so k=6. 
		int k = max - min + 1;
		
		int[] output = new int[n];
		int[] count = new int[k];
		
		// increment count array with respect to a array
		for(int i=0; i < n; i++) {
			count[a[i]] = count[a[i]]+1;
		}
	
		for(int i=1; i < k; i++) {
			count[i] = count[i] + count[i - 1];
		}
		
		for(int i=n-1; i >=0; i--) {
			output[count[a[i]] -1] = a[i];
			count[a[i]] = count[a[i]]-1;
		}
		
		for(int i=0; i<n; i++) {
			a[i] = output[i];
		}
		
	}
		
} 


