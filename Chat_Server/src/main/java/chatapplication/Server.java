package chatapplication;

import java.io.DataInputStream;

import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author namal
 */

public class Server {
public static void main(String[] args){
try{
ServerSocket ssocket=new ServerSocket(1023);
Socket socket=ssocket.accept();
DataInputStream DIStream=new DataInputStream(socket.getInputStream());
String str=(String)DIStream.readUTF();
System.out.println("message= "+str);

}catch(Exception e){
System.out.println(e);
}
}
}