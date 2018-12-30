package Server;

import java.net.ServerSocket;
import java.net.Socket;
import java.io.*;

public class server {
	 public static void main(String[] args) throws Exception{
		 ServerSocket ss=new ServerSocket(20171);
		 while (true) {
			 Socket client=ss.accept();
			 InputStream is=client.getInputStream();
			 OutputStream os=client.getOutputStream();
		 }
	 }
}
