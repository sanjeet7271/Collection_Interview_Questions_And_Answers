package ListInterfaceExamplesUsingIterator;

import java.util.Iterator;
import java.util.Stack;

public class StackExampleUsingIterator {
	public static void main(String[] args) {
		Stack<Integer> stack=new Stack<>();
		stack.push(5);
		stack.push(6);
		stack.push(3);
		stack.push(2);
		
		System.out.println(stack);
		Iterator<Integer> stackIterator=stack.iterator();
		while(stackIterator.hasNext()) {
			System.out.print(stackIterator.next()+" ");
		}
	}
}
