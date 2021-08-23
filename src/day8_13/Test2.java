package day8_13;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {

		System.out.println(1);
		System.out.println(2);

		if (true) {

			System.out.println(3);

		}
		if (1 < 2 && 1 < 3) {

			System.out.println(4);

		}

		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个数字");
		String num = sc.nextLine();

		/*
		 * if(Integer.parseInt(num)>0) {
		 * 
		 * System.out.println("是正数"); }else {
		 * 
		 * System.out.println("是负数");
		 * 
		 * }
		 */

		int num1 = Integer.parseInt(num);

		if (num1 == 1) {

			System.out.println("打印一");

		} else if (num1 == 2) {

			System.out.println("打印二");
		} else if (num1 == 3) {

			System.out.println("打印三");
		} else {
			if(num1<=100) {
				
				System.out.println("小于等于100");
			}else {
				
				System.out.println("打印其他");
			}
			

		}

	}

}
