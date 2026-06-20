package ListInterfaceExamplesUsingIterator;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExampleUsingIterator {
	public static void main(String[] args) {
		List<Integer> linkedList=new LinkedList<>();
		linkedList.add(2);
		linkedList.add(4);
		linkedList.add(5);
		linkedList.add(7);
		System.out.println(linkedList);
		Iterator<Integer> linkedListIterator=linkedList.iterator();
		while(linkedListIterator.hasNext()) {
			System.out.print(linkedListIterator.next()+" ");
		}
	}
}
