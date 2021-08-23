package day8_13;

public class Test1 {

	public static void main(String[] args) {
		
		int []array1=new int[2];
		
		array1[0]=1;
		array1[1]=2;
		
		int[]array2=new int [array1.length*2];
		
		
		//(源数组，源数组拷贝起始位置,目标数组，目标数组拷贝起始位置，拷贝个数)
		System.arraycopy(array1, 0, array2, 2, array1.length);
		
		System.out.println(array2);
		System.out.println(array2[0]);
		System.out.println(array2[1]);
		System.out.println(array2[2]);
		System.out.println(array2[3]);
		

	}

}
