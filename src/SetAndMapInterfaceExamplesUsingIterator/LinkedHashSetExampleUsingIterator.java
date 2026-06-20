package SetAndMapInterfaceExamplesUsingIterator;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExampleUsingIterator {
	public static void main(String[] args) {
		Set<Integer> linkedhashset=new LinkedHashSet<>();
		linkedhashset.add(34);
		linkedhashset.add(90);
		linkedhashset.add(30);
		
		System.out.println(linkedhashset);
		
		Iterator<Integer> linkedhashsetIterator=linkedhashset.iterator();
		while(linkedhashsetIterator.hasNext()) {
			System.out.print(linkedhashsetIterator.next()+" ");
		}
	}
}
