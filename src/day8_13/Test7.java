package day8_13;

public class Test7 {

	public static void main(String[] args) {

		int[] array1 = { 323, 22, 55, 58, 51, 41, 88, 998, 74 };

		for (int i = 0; i < array1.length; i++) {

			System.out.println(array1[i]);

		}

		System.out.println("==========");

		int i = 0;

		while (i < array1.length) {

			System.out.println(array1[i++]);

		}

		System.out.println("==========");

		for (i = 0; i < 5; i++) {

			if (i == 2) {

				continue;

			}
			System.out.println(i);

		}

		System.out.println("==========");

		for (int a = 0; a < 5; a++) {

			for (int b = 0; b < a; b++) {

				System.out.print("⭐");

			}
			
			System.out.println("⭐");
			
		}

	}

}
