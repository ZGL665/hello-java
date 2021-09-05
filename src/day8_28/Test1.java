package day8_28;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.omg.CosNaming.NamingContextExtPackage.AddressHelper;

public class Test1 {

	public static void main(String[] args) {

		Set set = new HashSet();

		set.add("tom1");
		set.add("tom2");
		set.add(1);
		set.add(300);
		set.add(true);
		System.out.println("========对象比较===========");

		User u1 = new User();
		u1.name = "zhangsan";
		set.add(u1);

		User u2 = new User();
		u2.name = "zhangsan";
		set.add(u2);

		System.out.println(u1.hashCode());
		System.out.println(u2.hashCode());
		System.out.println(u1.equals(u2));

		System.out.println(set);
		System.out.println("========对象比较结束===========");

		// set.add("tom2");// 不重复

		System.out.println("删除前=" + set);// 无序
		System.out.println(set.isEmpty());
		System.out.println(set.contains("tom1"));
		System.out.println(set.size());
		System.out.println("=====删除======");
		// set.remove("tom2");
		System.out.println("删除后=" + set);
		set.toArray();
		System.out.println("变成数组后=" + set);

		Object[] obj = set.toArray();
		for (int i = 0; i < obj.length; i++) {

			System.out.println(obj[i]);

		}

		for (Object obj1 : set) {

			System.out.println("增强for输出=" + obj1);

		}

		System.out.println("========迭代器迭代==========");

		Iterator it = set.iterator();
		while (it.hasNext()) {

			System.out.println(it.next());

		}

		System.out.println(set.size());
		System.out.println("===========迭代器讲解===========");

		set = new HashSet();

		set.add("150");
		set.add("abc");
		set.add("zhangsan");
		set.add("lisi");
		set.add("wangwu");

		System.out.println("set="+set);

		Iterator it1 = set.iterator();

		System.out.println(it1.hasNext());
		System.out.println(it1.next());

		System.out.println(it1.hasNext());
		it1.next();

		System.out.println(it1.hasNext());
		it1.next();

		System.out.println(it1.hasNext());
		it1.next();

		System.out.println(it1.hasNext());
		it1.next();

		System.out.println(it1.hasNext());

		Iterator it2 = set.iterator();

		while (it2.hasNext()) {

			String obj1 = (String)it2.next();
			System.out.println(obj1);

		}
		
		System.out.println("========List迭代器=========");
		
		List list=new ArrayList();		
		list.add("51testing");
		list.add("bwf");
		
		System.out.println("list="+list);
		
		
		
		for (Iterator it3 = list.iterator(); it3.hasNext();) {
			Object obj0 = (Object) it3.next();
			
			System.out.println(obj0);
			
		}
		
		
		set.remove("abc");
		System.out.println(set);
		
		list.remove(0);
		System.out.println(list);
		
		
		
		
		

	}

}
