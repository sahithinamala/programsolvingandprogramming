package ab;
import java.util.*;
public class LCM_19 {
	static int LCM(int n, int m) {
		int fn = n;
		int ln = m;
		int lcm = ln>fn ? ln : fn;
		while(true) {
			if(lcm%ln == 0 && lcm%fn == 0 ) {
				return lcm;
			}
			else {
				lcm++;
			}
		}
	}
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers");
		int n = sc.nextInt();
		int m = sc.nextInt();
		System.out.print(LCM(n,m));
	}

}
