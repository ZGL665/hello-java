package day8_13;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		System.out.println("==========欢迎来到潇洒超市==========");

		Scanner sc = new Scanner(System.in);

		System.out.println("请选择1登录\t2退出\t3操作错误");
		String choice = sc.nextLine();

		switch (Integer.parseInt(choice)) {
		case 1:

			System.out.println("请输入账号");
			String account = sc.nextLine();

			System.out.println("请输入密码");
			String pwd = sc.nextLine();

			if (account.equals("admin") && pwd.equals("123")) {

				System.out.println("登录成功");

			} else {

				System.out.println("账号或密码错误");

			}

			break;
		case 2:
			System.out.println("=======欢迎下次光临=======");
			System.exit(0);
			break;

		default:

			System.out.println("操作错误");
			break;
		}

	}

}
