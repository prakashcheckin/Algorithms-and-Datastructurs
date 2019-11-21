package com.dsa.sorting;

public class InsertionSort {
	
public static void main(String[] args) {
		
		int a[] = {2, 1, 6, 5, 8, 3};
		insertionSort(a, a.length);
	}
	
	public static void insertionSort(int a[], int n) {
		
		for (int j = 1; j < n; j++) {
			
			int key = a[j];
			int i =  j-1;
			
			while(i >= 0 && a[i] > key) {
				a[i+1]=a[i];
				i--;
			}
			
			a[i+1]= key; 
		}
		
		for(int value : a) 
		{
			System.out.print(" "+value);
		}
		
	}

}
