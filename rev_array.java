package ab;

import java.util.Scanner;

public class rev_array {
	static void swap(int x, int y, int[] arr) {
	    int temp = arr[x];
	    arr[x] = arr[y];
	    arr[y] = temp;
	  }
	static void arrayrev(int arr[], int n) {
		 for(int i=0; i < n/2; i++)
		        swap(i,n-i-1,arr);
		    for(int i = 0; i < n; i++)
		        System.out.println(arr[i]);
	}
	public static void main(String[]args) {
		 Scanner sc = new Scanner(System.in);
		    int n = sc.nextInt();
		    int arr[] = new int[n];
		    for(int i = 0;i<n;i++){
		        arr[i] = sc.nextInt();
		    }
		    arrayrev(arr,n);
	}

}
