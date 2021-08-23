package day8_13;

public class Test8 {

	public static void main(String[] args) {

		System.out.println("入口方法");

		// 调用m1
		m1();
		m2(100);
		m3("zhangsan");
		m4(500, "bwf");
		m5(20,"51testing","bwf");
		m1(20);
		m1("ppp");
		m1(60, "tt");
		m1("oo", 30);
	

	}

	public static void m1() {

		System.out.println("方法1-0");

	}
	public static void m1(int a) {

		System.out.println("方法1-1");

	}
	public static void m1(String a) {

		System.out.println("方法1-2");
	}
	public static void m1(int a,String b) {

		System.out.println("方法1-3");

	}
	public static void m1(String a,int b) {

		System.out.println("方法1-3");

	}

	public static void m2(int a) {

		System.out.println("方法2的参数：" + a);
	}

	public static void m3(String a) {

		System.out.println("方法3的参数：" + a);
	}

	public static void m4(int a,String b) {

		System.out.println("方法4的参数：" + a+b);
	}
	public static void m5(int a,String ...b) {

		System.out.println("方法5的参数：" + a+b.length);
	}
	
	
	
	
	
	
	
}
