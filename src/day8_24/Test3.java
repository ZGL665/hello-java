package day8_24;

import java.text.DecimalFormat;
import java.util.Random;

public class Test3 {

	public static void main(String[] args) {

		Integer a = 100;
		Integer b = 100;
		System.out.println(a == b);

		Integer a1 = 200;
		Integer b1 = 200;
		System.out.println(a1 == b1);

		System.out.println(Math.ceil(3.55));
		System.out.println(Math.ceil(3.99));
		System.out.println(Math.floor(3.55));
		System.out.println("=================");
		System.out.println(Math.round(3.4));

		for (int i = 0; i < 10; i++) {

			System.out.println((int) (Math.random() * (100 - 10 + 1) + 10));

		}
		System.out.println("====================");
		for (int k = 0; k < 5; k++) {

			System.out.println(10 + new Random().nextInt(100 - 10 + 1));
		}

	}

}
