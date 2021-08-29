package day8_24;

public class Test1 {

	public static void main(String[] args) {
		
		try {
			
			System.out.println(1/0);
			
		}catch (ArithmeticException e) {
			System.out.println("发生错误");
		}
		
		
		

	}

}
