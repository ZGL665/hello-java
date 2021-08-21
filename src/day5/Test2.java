package day5;

public class Test2 {

	public static void main(String[] args) {

		float[] array1 = new float[4];
		System.out.println(array1);

		int[] array2 = new int[5];
		System.out.println(array2);

		// 声明之后初始化默认值
		System.out.println(array1[0]);
		System.out.println(array2[0]);

		array1[0] = 100;
		array2[1] = (int) 300.11;

		System.out.println(array1[0]);
		System.out.println(array2[1]);

		array2[1] = (int) 655.3;
		System.out.println(array2[1]);

		System.out.println("==========");

		int[] array3;// 数组的声明
		array3 = new int[4];// 数组的初始化1
		System.out.println(array3);

		int[] array4;
		array4 = new int[] { 1, 2, 3 };// 数组的初始化2
		System.out.println(array4[2]);

		// 声明的同时初始化
		int[] array5 = new int[56];
		int[] array6 = new int[] { 12, 23, 34 };

		System.out.println(array5[55]);
		System.out.println(array6[2]);

		// 简写
		String[] array7 = { "潇洒", "张广良", "老孟" };
		System.out.println("众所周知，" + array7[1] + "的爸爸是" + array7[0]);
		System.out.println("众所周知，" + array7[2] + "的爸爸也是" + array7[1]);

		// 二维数组

		int[][] array8 = new int[5][3];

		System.out.println(array8[0]);

		array8[0][0] = 20;

		int[][] array9 = new int[3][];
		System.out.println(array9[0]);

		array9[0] = new int[] { 12, 23 };

		System.out.println(array9[0][0]);

		System.out.println("============aaa");
		// 一维数组的声明
		int[] a;
		a = new int[3]; // 数组空间3个
		System.out.println(a[0]);
		System.out.println(a);

		int[] b;
		b = new int[] { 1, 2, 3 };
		System.out.println(b[0]);

		int[] c = { 22, 33, 55 };
		System.out.println(c[1]);

		// 二维数组的声明
		int[][] d;
		d = new int[3][2];

		System.out.println(d[0]);
		System.out.println(d[1]);
		System.out.println(d[2]);

		System.out.println(d[0][0]);
		System.out.println(d[0][1]);

		int[][] e = new int[][] { { 12, 23 }, { 44, 55 } };

		System.out.println(e[0]);
		System.out.println(e[0][0]);
		System.out.println(e[0][1]);

		System.out.println(e[1]);
		System.out.println(e[1][0]);
		System.out.println(e[1][1]);
		// System.out.println(e[1][2]);     数组越界

		// 空指针的情况
		int[][] f;
		f = new int[2][];
		System.out.println(f[0]);
		
		
		//二维数组简写
		int[][] g = {

				{ 1, 2, 3, 5 }, { 22, 33 }, { 500, 600 }

		};
		System.out.println(g[1][0]);
		
		System.out.println("三维数组");
		
		
		int [][][] h;
		h=new int [][][] {{{1}},{{22,33},{44,55}},{{666},{777},{888}}};		
		System.out.println(h[1]);
		System.out.println(h[1][0]);
		System.out.println(h[1][0][1]);
		
		System.out.println(h.length);
		
		
		int[] i=new int[3];
		
		i[0]=1;
		i[1]=2;
		i[2]=3;
		System.out.println(i[0]);
		
		i=new int[] {9};
		System.out.println(i[0]);
		
		
		
		
		
		
		
	}
}