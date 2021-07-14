package ab;

import java.util.Scanner;

public class rev_for {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int rev = 0;
		int n = sc.nextInt();
		if(n!=0) {
		for(int i = 0; i <= n ; i++) {
			int rem = n%10;
			rev = rev*10+rem;
			 n = n/10;	
			
		}
		}
		
		
		System.out.println(rev);
	}

}


