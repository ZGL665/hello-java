package day8_24;

import java.util.Scanner;

public class Test2 {

	Exception e = null;// 定义异常对象

	public void show1() {

		Scanner sc = new Scanner(System.in);
		String info=sc.nextLine();

		if (info.equals("1")) {

			e = new Exception("异常1");

		} else if (info.equals("2")) {

			e = new Exception("异常2");
		}

		try {
			// 自动抛出异常
			// System.out.println(1 / 0);

			// 手动抛出异常

			if (e != null) {
				throw e;
			}
			System.out.println("show1");

		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}

	public void show2() throws Exception{
		
		System.out.println(1/0);
		
		
	}
	
	
	public static void main(String[] args) {

		System.out.println("开始");
		Test2 t = new Test2();
		//t.show1();
		
		
		try {
			t.show2();
		} catch (Exception e) {
			System.out.println("show2中的异常");
			System.out.println(e.getMessage());
			
		}
		System.out.println("结束");

	}

}
