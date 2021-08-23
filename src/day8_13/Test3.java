package day8_13;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("请输入账号");
		String account = sc.nextLine();

		System.out.println("请输入密码");
		String pwd = sc.nextLine();

		if (account.equals("admin") && pwd.equals("123")) {

			System.out.println("欢迎登陆");

		} else {

			System.out.println("账号密码错误");
		}

	}

}
