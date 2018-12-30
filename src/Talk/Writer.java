package Talk;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;

public class Writer extends Thread {
	private OutputStream os;
	private Scanner scanner=new Scanner(System.in);
	public Writer(OutputStream os){
		this.os=os;
	}
	public void run() {
			while(true) {
				try {
					System.out.println("请输入消息：");
					String mas=scanner.next();
					os.write(mas.getBytes("utf-8"));
					}catch(Exception e) {
				System.out.println("连接已中断");
				}	
			}
			}
}