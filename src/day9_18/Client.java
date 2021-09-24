package day9_18;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

import javax.sound.midi.MidiDevice.Info;

public class Client {

	public static void main(String[] args) throws Exception  {
		
		
		
		
		Socket s=new Socket("localhost", 8090);
		
		
		OutputStream out1=s.getOutputStream();
		DataOutputStream dout=new DataOutputStream(out1);
		
		Thread t=new Thread(new ClientThread(s)); 
		t.start();
		
		Scanner sc =new Scanner(System.in);
				
			while (true) {
				//循环输出消息
				System.out.println("请输入消息");
				dout.writeUTF(sc.nextLine());
			
				System.out.println("继续输入消息");
				
				
			}
		
		
		
		
		
	}

}
