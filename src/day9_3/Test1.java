package day9_3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Test1 {

	public static void main(String[] args) throws Exception {

	
		//创建连接
		
		List<Connection>  list=new ArrayList<>();
		System.out.println(list);
		
		
		for (int i = 0; i < 105; i++) {
			
			Connection conn = DBhelp.getConn();
			DBhelp.closeConn(conn);
			list.add(conn);
			
		}
		System.out.println(list.size());

		
		
		
	}

}
