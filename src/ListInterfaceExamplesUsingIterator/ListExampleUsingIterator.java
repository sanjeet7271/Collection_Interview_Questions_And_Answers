package ListInterfaceExamplesUsingIterator;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListExampleUsingIterator {
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(1,2,5,3,6,3,9,7,6,5);
		Iterator<Integer> listIterator=list.iterator();
		while(listIterator.hasNext()) {
			System.out.print(listIterator.next()+" ");
		}
	}
}
