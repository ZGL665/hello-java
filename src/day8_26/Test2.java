package day8_26;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Path;

public class Test2 {

	private static InputStream in;

	public static void main(String[] args) throws IOException {

		File file = new File("D:\\myfiles/a.txt");
		in = new FileInputStream(file);
		System.out.println(in);
		
		// 读取文件内容
		// System.out.println((char)in.read());

		int c;
		while ((c = in.read()) != -1) {

			System.out.print((char) c);

		}
		in.close();

		System.out.println("==========读取一组数据==========");

		file = new File("D:\\myfiles/a.txt");
		in = new FileInputStream(file);
		
		byte [] b=new byte [2];
		int i=0;
		i=in.read(b);  //第一次读取
		System.out.println(i);
		
		while((i=in.read())!=-1) {
			
			
			
			
			
			
		}
	
		
	}

}