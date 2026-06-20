package SetAndMapInterfaceExamplesUsingIterator;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExampleUsingIterator {
	public static void main(String[] args) {
		Map<Integer, String> linkedhasmap=new LinkedHashMap<>();
		linkedhasmap.put(1, "sanjeet");
		linkedhasmap.put(2, "kumar");
		linkedhasmap.put(3, "pandit");
		
		System.out.println(linkedhasmap);
		
		Iterator<Map.Entry<Integer,String>> linkedhasmapItertor=linkedhasmap.entrySet().iterator();
		while(linkedhasmapItertor.hasNext()) {
			Map.Entry<Integer, String> element=linkedhasmapItertor.next();
			System.out.println(element.getKey()+":"+element.getValue());
		}
	}
}
