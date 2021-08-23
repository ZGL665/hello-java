package day8_13;

import org.omg.Messaging.SyncScopeHelper;

public class Test4 {

	public static void main(String[] args) {
		
		int n=100;
		
		switch (n) {
		case 1:
			System.out.println("等于一");
			break;
		case 2:
			System.out.println("等于二");
			break;
		case 3:
			System.out.println("等于三");
			break;
			
		default:
			
			switch (n) {
			case 100:
				System.out.println("等于100");
				break;
			default:
				System.out.println("其他");
				break;
			}
			
			
		}
				

	}

}
