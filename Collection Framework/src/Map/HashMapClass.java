package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapClass {
	public static void main(String[] args) {
		
		//HashMap-fast, unsynchronized, works with single thread, allows one null key
		//HashTable-slow,synchronized, works with multiple thread, does not allow null key
		//LinkedHashMap-preserves the insertion order
		
		//Map map=new HashMap();
		Map<String,String> map=new HashMap<>();
		
		map.put("myName","Mike");
		map.put("myJob","Developer");
		map.put("myAge","31");
		map.put("x", "y");
		
		System.out.println(map);
		
		System.out.println(map.get("myName"));
		
		Set<String> keys=map.keySet();
		for (String key:keys) {
			System.out.println(map.get(key));
		}
		
	}

}
