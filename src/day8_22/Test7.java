package day8_22;

public class Test7 {

	public static void main(String[] args) {

		int[] array1 = new int[5];
		float[] array2 = new float[2];

		System.out.println(array2);
		System.out.println(array1);

		System.out.println(array1[0]);
		// System.out.println(array1[5]);
		System.out.println(array2[0]);

		array1[0] = 100;
		array1[4] = 200;

		array2[0] = 300;
		array1[1] = (int) 100.3;
		System.out.println(array2[0]);
		System.out.println(array1[1]);
		System.out.println("数组定义的同时并且初始化");
		int[] array3 = new int[] { 100, 3, 200, 52, 556 };
		System.out.println(array3[0]);
		System.out.println(array3[2]);
		System.out.println(array3[4]);
		// System.out.println(array3[5]); 数组越界
		System.out.println("简写");
		int[] array4 = { 1, 2, 5, 55 };

		System.out.println(array4[0]);
		System.out.println(array4[2]);
		System.out.println(array4[3]);
		// System.out.println(array4[4]);

		System.out.println("=====二维数组======");
		int[][] array5 = new int[3][2];
		System.out.println(array5[0]);
		System.out.println(array5[0].length);
		System.out.println(array5[1]);
		System.out.println(array5[2]);
		System.out.println(array5[0][0]);
		System.out.println(array5[0][1]);
		// System.out.println(array5[0][2]);

		array5[0][0] = 1;
		array5[0][1] = 2;

		array5[1][0] = 3;
		// array5[1][2]=4;

		array5[2][0] = 5;
		array5[2][1] = 6;

		int[][] array6 = new int[3][];
		System.out.println(array6[0]);

		array6[0] = new int[3];
		System.out.println(array6[0][0]);
		System.out.println(array6[0][1]);
		System.out.println(array6[0][2]);

		array6[1] = new int[2];

		array6[2] = new int[3];

		int[][] array7 = { { 1, 2, }, { 2, 3 } };

	}

}
