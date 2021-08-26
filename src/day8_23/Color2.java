package day8_23;

public enum Color2 {

	RED("red"), // 有参构造函数
	GREEN("green"), BLUE("blue");

	private Color2(String desc) {

		System.out.println("构造了：" + desc);

	}

}
