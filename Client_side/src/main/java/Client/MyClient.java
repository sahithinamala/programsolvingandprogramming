/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Client;

import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author namal
 */
public class MyClient {
    public static void main(String[]args)throws Exception{
        Scanner sc = new Scanner(System.in);
        int portnumber = 5001;
        Socket clientsoc;
        clientsoc = new Socket("localhost",portnumber);
       
        try (DataOutputStream dos = new DataOutputStream(clientsoc.getOutputStream())) {
            dos.writeUTF(sc.nextLine());
            dos.flush();
             
        }
          
        }
    
}
