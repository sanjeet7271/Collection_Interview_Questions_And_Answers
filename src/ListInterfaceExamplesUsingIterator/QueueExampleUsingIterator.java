package ListInterfaceExamplesUsingIterator;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;


public class QueueExampleUsingIterator {
	public static void main(String[] args) {
		Queue<String> queue=new LinkedList<>();
		queue.add("SAnjet");
		queue.add("pandit");
		queue.add("Kumar");
		
		System.out.println(queue);
		Iterator<String> queueIterator=queue.iterator();
		while(queueIterator.hasNext()) {
			System.out.print(queueIterator.next()+" ");
		}
	}
}
