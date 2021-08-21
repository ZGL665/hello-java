package day5;

public class Test3 {
	public static void main(String[] args) {
		
		
		
		int [] array1=new int[2];
		
		array1[0]=1;
		array1[1]=2;
		
		int[] array2=new int[array1.length*2];
		System.arraycopy(array1, 0,  array2, 0,array1.length);
		
		System.out.println(array2[0]);
		System.out.println(array2[1]);
		System.out.println(array2[2]);
		System.out.println(array2[3]);
		
		array2[2]=2;
		array2[3]=3;
		System.out.println(array2[2]);
		System.out.println(array2[3]);
				
		
		
		
		

	}

}
