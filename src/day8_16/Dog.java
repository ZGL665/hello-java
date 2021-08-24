package day8_16;

public class Dog {

	public String name;
	public int id;

	public Dog() {

		id = 100;
		name = "旺财";
		System.out.println("自己定义的无参构造函数");

	}

	public Dog(int id) {

		this.id = id; // 成员变量的初始化    this.成员变量=局部变量

		System.out.println("dog的编号" + id);

	}
	public Dog(int a,int b,int c) {
		
		this(c);
		
		System.out.println("调用这个类中的构造方法"+c);
		
		
	}
	

}
