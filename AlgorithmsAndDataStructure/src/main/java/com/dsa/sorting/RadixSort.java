package com.dsa.sorting;

import java.util.Arrays;

public class RadixSort {
	
//	Prefer radix sort only for positive different long range element

	/*Time Complexity : Totally 3 n for loop and 1 k for loop
	 O(d(3n + k))  that is O(n+k);
	 n -> n loop iteration;
	 k -> k loop iteration;
	 d -> number of digits in an input element (exp)

	Space Complexity: O(n+k)
	n -> output array size;
	k -> count array size*/
	
	public static void main(String[] args) {
		
		int a[] = {200, 500, 100, 6000};

		radixSort(a, a.length);
		System.out.println(Arrays.toString(a));
	}
	
	public static void radixSort(int[] a, int n) {
		
		int max = Arrays.stream(a).max().getAsInt();
		
		// this loop executed in ones, tens, hundreds, thoundands....etc
		for(int exp = 1; max/exp > 0; exp *= 10) {
			countSort(a, a.length, exp);
		}
		
	}
	
	public static void countSort(int[] a, int n, int exp) {
		
		int[] count = new int[10];
		int[] output = new int[n];
		
		
		for(int i=0; i < n; i++) {
			++count[a[i]/exp % 10];
		}
	
		for(int i=1; i < 10; i++) {
			count[i] += count[i - 1];
		}
		
		for(int i=n-1; i >=0; i--) {
			output[--count[(a[i]/exp) % 10]] = a[i];
		}
		
		for(int i=0; i<n; i++) {
			a[i] = output[i];
		}
		
	}

}
