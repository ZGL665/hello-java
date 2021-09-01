package day8_26;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;

import org.omg.Messaging.SyncScopeHelper;

public class Test1 {

	public static void main(String[] args) throws IOException {
		
		//项目根路径
		System.out.println(System.getProperty("user.dir"));
		
		//bin根目录
		System.out.println(Test1.class.getResource("/"));
		
		//当前文件在的目录
		System.out.println(Test1.class.getResource("").getPath());
		
		//默认相对路径就是i项目根路径
		
		System.out.println("======================");
		
		/*File f=new File("a.txt");
		System.out.println(f.getPath());
		System.out.println(f.getAbsolutePath());
		System.out.println(f.exists());*/
		
		
		File f1=new File(Test1.class.getResource("/").getPath()+"a.txt");
		System.out.println(f1.getPath());
		System.out.println(f1.getAbsolutePath());
		System.out.println(f1.exists());
		
		System.out.println("=============");
		
		File f2=new File(Test1.class.getResource("").getPath()+"a.txt");
		System.out.println(f2.getPath());
		System.out.println(f2.getAbsolutePath());
		System.out.println(f2.exists());
		
		System.out.println("=============");
		
		System.out.println(f2.isAbsolute());
		System.out.println(f2.isDirectory());
		System.out.println(f2.isFile());
		System.out.println(f2.isHidden());
		
		System.out.println("=============");
		String path="D:/myfile/a2.txt";
		
		File f3=new File(path);
		System.out.println(f3.isAbsolute());
		System.out.println(f3.isDirectory());
		System.out.println(f3.isFile());
		System.out.println(f3.isHidden());
		System.out.println(f3.canRead());
		System.out.println(f3.canExecute());
		System.out.println(f3.canWrite());
		
		File f4=new File("D:/myfile/a3.txt");
		f3.renameTo(f4);
		
		
		path="D:/myfile/a3.txt";
		File f5=new File(path);
		f5.delete();
		
		path="D:/myfile/a1.txt";
		File f6=new File(path);
		f6.createNewFile();
		
		
		
		
		
		
		
		
	}

}
