package ab;

import java.util.Scanner;

public class LCM_using_GCD_19 {
	static int gcd(int n,int m) {
		int hcf = 1;
		int fn = n;
		int ln = m;
		for(int i = 1; i<=fn && i <= ln; i++) {
			if(fn%i == 0 && ln%i == 0) {
				hcf = i;
				
				
			}
			
		}
		return hcf;
		
	}
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 2 numbers for finding GCD");
		int n = sc.nextInt();
		int m = sc.nextInt();
		int lcm = (m*n)/gcd(n,m);
		System.out.println(lcm);
		
	}
}
