package day9_18;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class Server {

	static InputStream in = null;
	static DataInputStream din = null;
	static ServerSocket ss = null;
	
	
	
	static OutputStream out=null;
	static DataOutputStream dout=null;
	

	public static void main(String[] args) {

		List<Socket> list=new ArrayList<Socket>();   //所有用户都能收到信息
		 
		try {
			ss = new ServerSocket(8090);// 创建插槽连接端口号
		} catch (IOException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		System.out.println("服务端在端口号8090监听客户端的连接.........");

		while (true) {

			Socket s = null;
			
			try {
					s = ss.accept(); // 服务端监听客户端连接
					list.add(s);
				
				System.out.println("欢迎客户端：——————" + s.getPort());

			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

			Thread t=new Thread(new ServerThread(s,list));			
			
			
			//Thread t=new Thread(new ServerThread());
			t.start();
			System.out.println("继续等待下一个客户端...........");

		}

	}

}
