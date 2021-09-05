package day8_28;

import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Test3 {

	public static void main(String[] args) {

		Map map = new HashMap();

		map.put(1, 1);
		map.put("a", "A");
		map.put(true, false);
		Object obj = new Object();
		map.put(obj, "obj对象");
		map.put("", "");
		map.put(null, null);

		Dog d1 = new Dog();
		d1.name = "潇洒";
		Dog d2 = new Dog();
		d2.name = "潇洒";

		map.put(d1, "狗名1");
		map.put(d2, "狗名2");

		System.out.println("============================");

		System.out.println(map);
		System.out.println(map.size());

		System.out.println(map.get("a"));
		System.out.println(map.get(obj));

		System.out.println(map.get(true));
		System.out.println("============所有map================");
		System.out.println(map);

		System.out.println("=============循环遍历===============");

		Set set = map.keySet();

		System.out.println(set);

		for (Object object : set) {

			System.out.println("键" + object + "值" + map.get(object));

		}

		System.out.println("=============迭代器循环遍历===============");
		for (Iterator it = set.iterator(); it.hasNext();) {
			Object object = (Object) it.next();

			System.out.println(object);

		}

		System.out.println("=============循环遍历values===============");

		Collection values = map.values();

		System.out.println(values);

		for (Object values1 : values) {

			System.out.println(values1);

		}

		System.out.println("=============循环遍历entrySet===============");

		Set entry = map.entrySet();

		System.out.println(entry);

		System.out.println(entry.getClass());

		for (Object en1 : entry) {

			System.out.println(((Entry) en1).getKey() + "===" + ((Entry) en1).getValue());

		}

		Map map2 = new Hashtable();

		map2.put("a", "A");
		map2.put("b", "B");

		System.out.println(map2);

	}

}
