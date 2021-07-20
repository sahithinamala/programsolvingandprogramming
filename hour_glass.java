package ab;

import java.util.Scanner;

public class hour_glass {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int maxsum = Integer.MIN_VALUE;
		int arr[][] = new int[n][m];
		for(int  i =0;i<n;i++) {
			for(int j = 0; j<n;j++) {
				arr[i][j] = sc.nextInt();
				if(i>1 && j>1) {
					int sum = arr[i][j]+arr[i][j+1]+arr[i][j+2]+arr[i+1][j+1]+arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
					
				
				if(sum>maxsum) {
					maxsum = sum;
				}
			}}
		}
		System.out.println(maxsum);
		
	}

}
