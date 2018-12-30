package Talk;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class Reader extends Thread {
	private InputStream is;
	public Reader(InputStream is){
		this.is=is;
	}
	public void run() {
		byte[] buff=new byte[1024];
			while(true) {
				ByteArrayOutputStream baos=new ByteArrayOutputStream();
				try {
					while(true) {
						int len=-1;
						len=is.read(buff);
						baos.write(buff, 0, len);
						if (len<1024) {
							break;
						}
					}
						System.out.println("收到信息:"+baos.toString("utf-8"));
					}catch(Exception e) {
				System.out.println("连接已中断");
				}
			}
	}
}
