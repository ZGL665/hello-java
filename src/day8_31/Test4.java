package day8_31;


import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class Test4<T> {

	public String show1(String string) {

		return "bwf";

	}

	public static void main(String[] args) throws Exception {

		Properties pro = new Properties();

		InputStream in = Test4.class.getResourceAsStream("my.properties");

		pro.load(in);

		pro.setProperty("age", "23");

		System.out.println(pro.getProperty("id"));
		System.out.println(pro.getProperty("age"));
		System.out.println(pro.getProperty("name"));
		System.out.println(pro.getProperty("sex"));

		System.out.println("============================");

		List<String> list = new ArrayList<String>();

		list.add("zhangsan");
		list.add("100");

		Test4<String> test4 = new Test4<String>();

		System.out.println(test4.show1("222"));

	}

}
