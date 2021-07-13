package ab;

import java.util.Scanner;
public class gcd_18_while {
	static int gcd(int n,int m) {
		int ln = m;
		int fn = n;
		while(ln!=fn) {
			if(fn>ln) {
				fn = fn - ln;
			}
			else if(ln>fn) {
				ln = ln - fn;
			}	
		}
		return fn;
	}
	public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the 2 numbers for finding GCD");
	int n = sc.nextInt();
	int m = sc.nextInt();
	System.out.println(gcd(n,m));
	}
}
