package ListInterfaceExamplesUsingIterator;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorExampleUsingIterator {
	public static void main(String[] args) {
		Vector<Integer> vector=new Vector<Integer>();
		vector.add(3);
		vector.add(5);
		vector.add(2);
		vector.add(9);
		
		System.out.println(vector);
		System.out.println("****************Print Using Iterator************************");
		Iterator<Integer> vectorIterator=vector.iterator();
		while(vectorIterator.hasNext()) {
			System.out.print(vectorIterator.next()+" ");
		}
		System.out.println();
		System.out.println("***************Print using Enumeration*************************");
		Enumeration<Integer> vectorEnum=vector.elements();
		while(vectorEnum.hasMoreElements()) {
			System.out.print(vectorEnum.nextElement()+" ");
		}
	}
}
