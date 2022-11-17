package in.Assignment_2.ineuron;

import java.util.Arrays;
//Quick Sort Algorithm.

public class Answer2 {
	public static void main(String[] args) {
		int arr[] = {9,5,4,8,7,2,3};
		int n = arr.length;
		quickSort(arr,0,n-1);
		System.out.println(Arrays.toString(arr));
	}

	 static void quickSort(int[] arr, int l, int h) {
		if (l<h) {
			int pivot = partition(arr, l, h);
			quickSort(arr, l, pivot-1);
			quickSort(arr, pivot+1, h);
		}	
	}
	 
	 static int  partition(int arr[],int l, int h) {
		 int pivot = arr[l];
		 int i = l;
		 int j = h;
		 while(i<j) {
		 while(i<=j && pivot >= arr[i]) i++;
		 while(pivot < arr[j]) j--;
		 if (i<j) {
			 swap(arr,i,j);
		}
	
		 }
		 swap(arr, l, j);
		 return j;
	 }
	 
	static void swap(int arr[],int x,int y) {
		int temp = arr[x];
		arr[x] = arr[y];
		arr[y] = temp;
	}
}
