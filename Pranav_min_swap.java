package ab;

import java.util.Scanner;

public class Pranav_min_swap {
	static void minswap(int n, int arr[],int k) {
		int count  = 0;
		for(int j = 0;j<n;j++) {
		if(n<1&& n>Math.pow(10, 5)) {
			System.out.println("Constraints are not followed");
		}
		else if(arr[j]>1048 && arr[j]<-1048) {
			System.out.println("Constraints are not followed");
			
		}
		else if(k<-1048 && k>1048) {
			System.out.println("Constraints are not followed");
		}
		else {
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
	   minswap(n,arr,k);
	  
	}
	}