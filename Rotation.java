package ab;

import java.util.Scanner;

public class Rotation {
	static void leftRotate(int arr[], int rotation, int n)
    {
        for (int i = 0; i < rotation; i++)
            leftRotatebyOne(arr, n);
    }
 
    static void leftRotatebyOne(int arr[], int n)
    {
        int i, temp;
        temp = arr[0];
        for (i = 0; i < n - 1; i++)
            arr[i] = arr[i + 1];
        arr[n-1] = temp;
    }
    static void printArray(int arr[],int n) {
    	for(int i = 0;i <n; i++) {
    		System.out.println(arr[i]);
    	}
    }
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0;i <n; i++) {
			arr[i] = sc.nextInt();
		}
		int rotation = sc.nextInt();
		leftRotate(arr,rotation,n);
		printArray(arr,n);
	}

}
