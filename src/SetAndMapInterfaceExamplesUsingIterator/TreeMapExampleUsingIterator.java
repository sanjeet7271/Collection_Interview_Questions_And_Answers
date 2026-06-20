package SetAndMapInterfaceExamplesUsingIterator;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapExampleUsingIterator {
	public static void main(String[] args) {
		Map<Integer,String> map=new TreeMap<>();
		map.put(1, "Sanjeet");
		map.put(2, "kumar");
		map.put(3, "pandit");
		
		System.out.println("******Normal Print**************");
		System.out.println(map);
		System.out.println("******print using foreach **************");
		map.forEach((k,v)->System.out.println(k+":"+v));
		System.out.println("******print using Iterator **************");
		Iterator<Map.Entry<Integer,String>> treemapIterator=map.entrySet().iterator();
		while(treemapIterator.hasNext()) {
			Map.Entry<Integer, String> element=treemapIterator.next();
			System.out.println(element.getKey()+":"+element.getValue());
		}
	}
}
