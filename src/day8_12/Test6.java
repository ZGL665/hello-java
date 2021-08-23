package day8_12;

public class Test6 {

	public static void main(String[] args) {
		byte a0=50;
		
		short a1=a0;
		int a=100;
		long a2=a;
		int c1=(int) a2;
		System.out.println(c1);
		float b=a1;
		double c=a;
		
		c1=(int)3.14;
		System.out.println(c1);
		System.out.println(b);
		System.out.println(c);
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(3.124f);
		System.out.println(5/2);
		System.out.println(5f/2f);
		
		String s1=String.valueOf(c1);
		System.out.println(s1);
		
		System.out.println(b);
		String s2="100";
		
		b=Float.parseFloat(s2);
		System.out.println(b);
		
		System.out.println(5.2/2);
		System.out.println(22+3);
		System.out.println("22"+3);
		System.out.println('2'+3);
		
		System.out.println(3&2);
		System.out.println(3|2);
		System.out.println(3^2);
		
		
		

	}

}
