package SetAndMapInterfaceExamplesUsingIterator;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapExampleUsingIterator {
	public static void main(String[] args) {
		Map<String,String> map=new HashMap<>();
		map.put("1", "sanjeet");
		map.put("2", "kumar");
		map.put("3", "Pandit");
		
		System.out.println(map);
		
		Iterator<Entry<String, String>> hashmapIterator=map.entrySet().iterator();
		while(hashmapIterator.hasNext()) {
			Map.Entry<String, String> iterator=hashmapIterator.next();
			System.out.print(iterator.getKey()+": "+iterator.getValue()+" ");
		}
	}
}
