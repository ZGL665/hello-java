package Day8_17;

public class Test1 {

	public static void main(String[] args) {

		int a = 10;
		int b = 10;
		int c = 10;

		System.out.println(a == b);
		System.out.println(a == c);
		System.out.println(c == b);

		User u1 = new User();

		u1.name = "zhangsan";

		User u2 = new User();

		u2.name = "zhangsan";

		System.out.println(u1==u2);

		System.out.println(u1);
		System.out.println(u2);
		
		System.out.println(u1.equals(u2));
		
		System.out.println("=================");
		
		String a1="bwf";
		String a2="bwf";
		System.out.println(a1.equals(a2));
		
		
		
		
		
		
		
		
		
		
	}

}
