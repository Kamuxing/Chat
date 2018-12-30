package Clients;

import java.io.*;
import java.net.Socket;
import Talk.Reader;
import Talk.Writer;

public class clients {
	public static void main(String[] args)throws Exception{
		Socket clients=new Socket("127.0.0.1",20171);
		InputStream is=clients.getInputStream();
	    OutputStream os=clients.getOutputStream();
	    new Reader(is).start();
	    new Writer(os).start();
	}
}


