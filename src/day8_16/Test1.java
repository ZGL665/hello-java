package day8_16;

public class Test1 {

	public static void main(String[] args) {
		
		Person p1=new Person();
		
		System.out.println("姓名"+p1.name);
		System.out.println("年龄"+p1.age);
		System.out.println("性别"+p1.sex);
		
		p1.eat();
		int score=p1.study(99);
		System.out.println("考试得了"+score+"分");

		
		Person p2=new Person();
		
		System.out.println(p1);
		System.out.println(p2);
		
		System.out.println("===========");
		
		Dog d1=new Dog(1);
		
		System.out.println(d1.name);
		System.out.println(d1.id);
		
		
		
	}

}
