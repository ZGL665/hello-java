package day5;

import java.util.Scanner;

public class test4 {

	public static void main(String[] args) {

		if (true) {

			System.out.println(1);

		}

		if (!true) {

			System.out.println(2);
		}
		;

		System.out.println(3);

		if (1 < 2 && 2 < 3) {
		}

		System.out.println(6);

		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个数字");
		String num = sc.nextLine();

		int num1 = Integer.parseInt(num);

		/*
		 * if(num1>0) {
		 * 
		 * System.out.println("判断正确");
		 * 
		 * }else {
		 * 
		 * 
		 * System.out.println("判断错误"); }
		 */

		if (num1 == 1) {

			System.out.println("一");

		} else if (num1 == 2) {

			System.out.println("二");

		} else if (num1 == 3) {

			System.out.println("三");
		} else {

			System.out.println("不正确");

		}

	}

}
