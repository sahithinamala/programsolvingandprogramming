package ab;
import java.util.*;
public class Armstrong {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int totalnumber = 0;
		System.out.println("Enter a number");
		int n = sc.nextInt();
		int originaln = n;
		while(n!=0) {
			int rem = n%10;
			n = n/10;
			
			int mulrem = (rem*rem*rem);
			 totalnumber = totalnumber + mulrem;
		}
		
		if(totalnumber == originaln) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
		
		
	}

}
