package SetAndMapInterfaceExamplesUsingIterator;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExampleUsingIterator {
	public static void main(String[] args) {
		Set<Integer> treeset=new TreeSet<>();
		treeset.add(34);
		treeset.add(90);
		treeset.add(13);
		
		System.out.println(treeset);
		
		Iterator<Integer> treesetIterator=treeset.iterator();
		while(treesetIterator.hasNext()) {
			System.out.print(treesetIterator.next()+" ");
		}
	}
}
