package in.Assignment_2.ineuron;
// Merge sort

public class Answer4 {

	public static void main(String[] args) {
		int arr[] = {2,1,7,4,6,9,3};
		int n = arr.length;
		divide(arr,0,n-1);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	static void divide(int arr[], int l, int r) {
		if (l>=r) return;
			int mid = l + (r-l)/2;
			divide(arr, l, mid);
			divide(arr, mid+1, r);
			merge(arr,l,mid,r);
		
	}

	 static void merge(int[] arr, int l, int mid, int r) {
		 int[] merged = new int[r-l+1];
		int i = l;
		int j = mid+1;
		int k = 0;
		
		while (i<=mid && j<=r) {
			if (arr[i]<=arr[j]) {
				merged[k++] = arr[i++];
			} else {
				merged[k++] = arr[j++];
			}
		}
		
		while (i<=mid) {
			merged[k++] = arr[i++];
		}
		while (j<=r) {
			merged[k++] = arr[j++];
		}
		
			 for(int k1=0,k2=l;k1< merged.length;k1++,k2++){
		            arr[k2]= merged[k1];
		}
	}
	 
	 
}

