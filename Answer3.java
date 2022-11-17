package in.Assignment_2.ineuron;

import java.util.Arrays;
//Bubble Sort Algorithm.

public class Answer3 {

	public static void main(String[] args) {
		int[] arr = {8,5,4,9,10,20};
		bubbleSort(arr);
		System.out.println(Arrays.toString(arr)); 
	}

	static void bubbleSort(int arr[]) {
		int n = arr.length;
		for (int i = 0; i <  n; i++) {
			for (int j = 0; j < n-i-1; j++) {
				if (arr[j] > arr[j+1]) {
					swap(arr, j, j+1);
				}
			}
		}
	}
	
	static void swap(int arr[], int i, int j) {
		int temp = arr[j];
		arr[j] = arr[i];
		arr[i] = temp;
	}
}
