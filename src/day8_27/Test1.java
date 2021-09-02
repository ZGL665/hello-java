package day8_27;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class Test1 {

	public static void main(String[] args) throws Exception {

		User u = new User();
		u.setId(1);
		u.setName("bwf");
		
		
		File file=new File("D:/myfiles/user.txt");
		OutputStream out=new FileOutputStream(file);
		
		
		
		
		
		
		

	}

}
