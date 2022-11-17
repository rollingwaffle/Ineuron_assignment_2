package in.Assignment_2.ineuron;

import java.util.Arrays;

//Selection Sort Algorithm.

public class Answer5 {
	public static void main(String[] args) {
		int arr[] = {4,1,9,2,3,6};
		
		for (int i = 0; i < arr.length-1; i++) {
			int minIndex = i;
			for (int j = i+1; j < arr.length; j++) {
				if (arr[minIndex] > arr[j]) {
					minIndex = j;
				}
			}
			if(minIndex != i) {
				int temp = arr[minIndex];
			  arr[minIndex] = arr[i];
			  arr[i] = temp;
			}
			System.out.println(Arrays.toString(arr));

		}
	}
}
