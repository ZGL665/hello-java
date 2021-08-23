package day8_16;

public class Person {
	
	//自定义类
	
	//属性/特征
	public String name="zhangsan";
	public int age=18;
	public char sex='男';
			
	//方法		
	public void eat() {
		
		System.out.println(name+"吃饭");
		
	}
	public int study(int score) {
		
		System.out.println(name+"学习");
		return score;
		
	}
	public void sleep(){
		
		System.out.println("睡觉");
		
		
	}
	
	
	
	

}
