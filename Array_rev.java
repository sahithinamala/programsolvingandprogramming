package ab;

import java.util.Scanner;

public class Array_rev {
	static void arrayrev(int arr[],int n) {
		 int[] b = new int[n];
	        int j = n;
	        for (int i = 0; i < n; i++) {
	        	int temp = b[j-1];
	            b[j - 1] = arr[i];
	            j = j - 1;
	            arr[i] = temp;
	        }
	        for (int k = 0; k < n; k++) {
	            System.out.println(b[k]);
	        }
	}
	 public static void main(String[]args){
		    Scanner sc = new Scanner(System.in);
		    int n = sc.nextInt();
		    int arr[] = new int[n];
		    for(int i = 0;i<n;i++){
		        arr[i] = sc.nextInt();
		    }
		    arrayrev(arr,n);
	 }
}
