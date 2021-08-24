package Day8_17;

public class Test2 {

	public static void main(String[] args) {
		
		
		Student s1=new Student();
		
		s1.id=10;
		s1.name="张三";
		s1.age=22;		
		s1.sex='男';
		
		s1.eat();
		s1.sleep();
		s1.study();
		
		
		Teacher t1=new Teacher();
		
		t1.name="李老师";
		t1.age=33;
		t1.id=55;
		t1.sex='女';
		t1.teachCard="语文组";
		
		t1.eat();
		t1.sleep();
		t1.teach();
				
		
		
		
		
		
		
		

	}

}
