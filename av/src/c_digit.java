package ab;
import java.util.*;
public class c_digit {
	
		  public static void main(String[] args) {
			  System.out.println("Enter a number");
			  Scanner sc = new Scanner(System.in);

		    int count = 0, num = sc.nextInt();

		    while (num != 0) {
		      
		      num /= 10;
		      ++count;
		    }

		    System.out.println("Number of digits " + count);
		  }
		}

