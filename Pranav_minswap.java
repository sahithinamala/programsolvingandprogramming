package ab;

import java.util.Scanner;

class Pranav_minswap{

static int minSwap(int arr[], int n, int k) {
	int count  =0;
	for(int i = 0;i <n;i++) {
		
		if(arr[i]<=k) {
			count++;
		}
		if(arr[i]>k) {
			
		}
	}
}
  

public static void main(String[] args) 
{
    Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
	    int arr[] = new int[n];
	    for(int i = 0;i <n;i++) {
	    	arr[i] = sc.nextInt();
	    }
	    
	    int k = sc.nextInt();
	   System.out.println(minSwap(arr,n,k));
}
}
