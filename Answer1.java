package in.Assignment_2.ineuron;

import java.util.Scanner;
//duplicates present in an array.

public class Answer1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int length;
		System.out.println("Enter length of an array");
		length = scanner.nextInt();
		
		Integer[] arr = new Integer[length];
	
		System.out.println("Enter an elements array of type Integer");
		
		for (int j = 0; j < arr.length; j++) {
			arr[j] = scanner.nextInt();
		}
		scanner.close();
		System.out.println();
		System.out.println("The duplicates elements present in array are: ");
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.print(arr[j] + " ");
				}
			}
		}
	}
}
