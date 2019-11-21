package com.dsa.sorting;

public class QuickSort {
	
	public static void main(String[] arg) {
		
		int a[] = {9, 2, 1, 6, 5, 8};
		quickSort(a, 0, a.length-1);
		
		for(int value : a) 
		{
			System.out.print(" "+ value);
		}
	}

	public static void quickSort(int a[], int p, int r) {
		
		if(p < r) 
		{
			int q = partition(a, p, r);
			quickSort(a, p, q-1);
			quickSort(a, q+1, r);
		}
	}
	
	public static int partition(int a[], int p, int r) {
	
 		int x = a[r];
		int i = p-1;
		
		for(int j=p; j < r; j++) 
		{
			if(a[j] < x) 
			{
				i= i+1;
				int temp = a[j];
				a[j] = a[i];
				a[i] = temp;
			}
		}

		int temp = a[i+1];
		a[i+1] = a[r];
		a[r] =  temp;
		
		return  i+1;
	}
}
