package javaapplication1;

import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.Signature;

import java.util.Scanner;
import javax.crypto.Cipher;


class Admin{
    Scanner sc = new Scanner(System.in);
 
    public String RegNo;
    private  String password;
    public void Adm(String RegNo,String password){
        
        this.RegNo = RegNo;
        this.password = password;
    }
    
     String Password() throws Exception{
         Signature sign = Signature.getInstance("SHA256withRSA");
      KeyPairGenerator keyPairGen = KeyPairGenerator.getInstance("RSA");
      keyPairGen.initialize(2048);
      KeyPair pair = keyPairGen.generateKeyPair();     
      Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
      cipher.init(Cipher.ENCRYPT_MODE, pair.getPublic());
      byte[] input = password.getBytes();	  
      cipher.update(input);
      byte[] cipherText = cipher.doFinal();	 
      System.out.println(new String(cipherText, password));
      return password;
        
    }
  
     
 }
class Student{
    
    
}
public class Details {
    public static void main(String[]args)throws Exception{
        Admin ad = new Admin();
        Student sd = new Student();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter password");
        String password = sc.nextLine();
     
   }
}