package ab;
import java.util.*;

public class GCD_18 {
	
	static int gcd(int n, int m) {
		int fn = n;
		int ln = m;
		if(fn == 0) {
			return ln;
		}
		else if(ln == 0) {
			return fn;
		}
		else if(ln>fn) {
			return gcd(fn,ln-fn);
			
		}
		else {
			return gcd(fn-ln,ln);
		}
	}
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 2 numbers for finding GCD");
		int n = sc.nextInt();
		int m = sc.nextInt();
		System.out.println(gcd(m,n));
		
	}

}
