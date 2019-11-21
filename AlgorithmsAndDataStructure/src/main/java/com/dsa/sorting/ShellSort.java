package com.dsa.sorting;

import java.util.Arrays;

/*
Time complexity: worst case time complexity is order of n square*/

public class ShellSort {

	public static void main(String[] args) {
		
		int a[] = {12, 34, 54, 2, 3, 0, -5, -10};

		shellsort(a, a.length);
		
		System.out.println(Arrays.toString(a));
		
	}
	
	public static void shellsort(int[] a, int n) {
		
		for(int gap = n/2; gap >=1;  gap /=2) {
			 
			for(int j= gap; j < n; j++) {
				
				for(int i = j-gap; i >=0; i= i-gap) {
					
					if(a[i+gap] > a[i]) {
						break;
					}
					else {
						int temp = a[i];
						a[i] = a[i+gap];
						a[i+gap] = temp;
					}
				}
			}
		}
	}
	
}
