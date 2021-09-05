package day8_28;

import java.util.Set;
import java.util.TreeSet;

public class Test2 {

	public static void main(String[] args) {


		Goods g1=new Goods("袜子", 1, "BH002");
		Goods g2=new Goods("鞋子", 2, "BH003");
		Goods g3=new Goods("裤子", 3, "BH001");
		
		Set set=new TreeSet();
		
		set.add(g2);
		set.add(g1);
		set.add(g3);
		
		System.out.println(set);
		
		
	}

}
