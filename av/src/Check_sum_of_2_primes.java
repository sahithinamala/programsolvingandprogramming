package ab;

import java.util.*;

public class Check_sum_of_2_primes {
	static boolean checkPrime(int num) {
	    boolean isPrime = true;

	    for (int i = 2; i <= num / 2; ++i) {
	      if (num % i == 0) {
	        isPrime = false;
	        break;
	      }
	    }
	    return isPrime;
	}

	
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
	
		int number  = sc.nextInt();
		 boolean flag = false;
		    for (int i = 2; i <= number / 2; ++i) {

		      if (checkPrime(i)) {
		        if (checkPrime(number - i)) {
		          System.out.printf("%d = %d + %d\n", number, i, number - i);
		          flag = true;
		        }

		      }
		    }
	}
}
	
	
				
	
		
	


