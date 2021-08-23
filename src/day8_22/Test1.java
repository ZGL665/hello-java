package day8_22;

import java.util.Scanner;

public class Test1 {
	
	public static void main(String[] args) {
		//接收控制台输入的数据
		Scanner sc =new Scanner(System.in);
		System.out.println("请输入姓名");
		String name=sc.nextLine();
		
		System.out.println("请输入年龄");
		String age=sc.nextLine();
		
		System.out.println("请输入职务");
		String job=sc.nextLine();
		
		
		System.out.print("姓名：");
		System.out.print(name);
		System.out.print('\t');
		
		System.out.print("年龄：");
		System.out.print(age);
		System.out.print('\t');
		System.out.print('\t');
		
		System.out.print("职务：");
		System.out.print(job);
		
		System.out.print('\t');
		
	}

}
