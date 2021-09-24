package day9_18;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.List;

public class ServerThread implements Runnable {

	private Socket socket;
	private List<Socket> list;

	ServerThread(Socket socket, List<Socket> list) {

		this.socket = socket;
		this.list = list;
	}

	@Override
	public void run() {

		DataInputStream din = null;
		OutputStream out = null;
		DataOutputStream dout = null;
		InputStream in = null;

		try {
			in = socket.getInputStream();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		din = new DataInputStream(in);

		while (true) {

			// 循环读取客户端传过来的数据
			try {
				String info = din.readUTF();
				System.out.println("欢迎客户端————" + socket.getPort() + "传过来的信息是————" + info);

				out = socket.getOutputStream();
				dout = new DataOutputStream(out);
				dout.writeUTF("欢迎客户端————" + socket.getPort()); // 服务端输出信息

				for (int i = 0; i < list.size(); i++) {// 将当前客户的发言发送给所有人
					Socket s = list.get(i);
					OutputStream o = s.getOutputStream();// 服务器端的输出流
					DataOutputStream so = new DataOutputStream(o);
					if (!socket.isClosed())
						so.writeUTF(socket.getPort() + ":" + info);
				}

			} catch (Exception e) {
				System.out.println("退出");
				break;
			}

		}

	}

	public static void main(String[] args) {

	}

}
