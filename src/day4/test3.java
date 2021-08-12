package day4;

import java.util.Scanner;

public class test3 {

	public static void main(String[] args) {
		//接收控制台输入的数据
		Scanner sc=new Scanner(System.in);
		
		System.out.println("请输入姓名：");
		String name=sc.nextLine();
		
		System.out.println("请输入性别：");
		String sex=sc.nextLine();
		
		System.out.println("请输入年龄：");
		String age=sc.nextLine();
		
		System.out.print("姓名：");
		System.out.print(name);
		System.out.println('\t');
		
		System.out.print("性别：");
		System.out.print(sex);
		System.out.println('\t');
		
		System.out.print("年龄：");
		System.out.print(age);
		
		
				
	}

}
