package day8_18;

public interface IC {

	public void show1();         //抽象方法

	public default void show2() {         //默认方法
 
		System.out.println("IC接口的show2");

	}

	public static void show3() {         //静态方法

		System.out.println("IC接口的show3");

	};

}
