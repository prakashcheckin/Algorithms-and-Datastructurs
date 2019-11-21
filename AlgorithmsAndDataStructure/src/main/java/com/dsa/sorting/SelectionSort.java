package com.dsa.sorting;

public class SelectionSort {

	public static void main(String[] args) {
		
		int a[] = {2, 1, 6, 5, 8, 3};
		selectionSort(a, a.length);
	}
	
	public static void selectionSort(int a[], int n) {
		
		for( int i=0; i < n-1; i++)
		{
			int iMin =i;
			for(int j= i+1; j < n; j++)
			{
				if(a[j] < a[iMin])
					iMin = j;
			}
			int temp = a[i];
			a[i] = a[iMin];
			a[iMin] = temp;
		}
		
		for(int value : a) 
		{
			System.out.print(value);
		}
		
	}
}
