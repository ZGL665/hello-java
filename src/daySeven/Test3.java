package daySeven;

public class Test3 {

	static int a2 = 100;
	static int b1;
	static long c1;
	static float d1;
	static double d2;
	static boolean e;
	static char f;

	public static void main(String[] args) {

		int a1 = 200;
		a2 = 300;
		System.out.println("局部重新定义后打印a2的值为" + a2);
		a2 = 400;
		System.out.println("局部修改后打印a2的值为" + a2);

		//System.out.println(a1); System.out.println(a2);
		 
		{
			int i=155;
			System.out.println(i);
		}
		
	System.out.println(b1);
	System.out.println(c1);
	System.out.println(d1);
	System.out.println(d2);
	System.out.println(e);
	System.out.println(f);
	
	show1();
	}

	public static void show1() {

		System.out.println("调用show1方法打印a2的值为" + a2);
		System.out.println(b1);
		System.out.println(f);
	}

}
