import java.io.*;
import java.util.*;
public class Convert_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String consonants = "BCDFGHJKLMNPQRSTVWXYZ";
		String cons = "bcdfghjklmnpqrstvwxyz";
		String word = scan.nextLine();
		char[] letters = word.toCharArray();
		String num = "";
		for(int i = 0;i < word.length();i++)
		{
			if(letters[i] == 'A' || letters[i] == 'E' || letters[i] == 'I' || letters[i] == 'O' || letters[i] == 'U')
			{
				num+= "6";
			}
			else if(letters[i] == 'a' || letters[i] == 'e' || letters[i] == 'i' || letters[i] == 'o' || letters[i] == 'u')
			{
				num+="2";
			}
			else if(consonants.indexOf(letters[i]) != -1)
			{
				num+="3";
			}
			else if(cons.indexOf(letters[i]) != -1)
			{
				num+="9";
			}
			else
			{
				int rem = i%10;
				num+= String.valueOf(rem);
			}
		}
		System.out.println(num);
	}

}