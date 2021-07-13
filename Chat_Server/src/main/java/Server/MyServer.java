/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Server;
import java.io.DataInputStream;

import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author namal
 */

public class MyServer {
public static void main(String[] args){
try{
ServerSocket ssocket=new ServerSocket(5001);
Socket socket=ssocket.accept();
DataInputStream DIStream=new DataInputStream(socket.getInputStream());
String str=(String)DIStream.readUTF();
System.out.println("message= "+str);

}catch(Exception e){
System.out.println(e);
}
}
}
