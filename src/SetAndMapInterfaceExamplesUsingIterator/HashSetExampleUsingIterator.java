package SetAndMapInterfaceExamplesUsingIterator;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExampleUsingIterator {
	public static void main(String[] args) {
		Set<Integer> hashset=new HashSet<>();
		hashset.add(45);
		hashset.add(30);
		hashset.add(40);
		hashset.add(10);
		System.out.println(hashset);
		Iterator<Integer> hashsetIterator=hashset.iterator();
		while(hashsetIterator.hasNext()) {
			System.out.print(hashsetIterator.next()+" ");
		}
	}
}
