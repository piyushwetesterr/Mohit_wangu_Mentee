package Collections_Demo;


//ListIterator is a very powerful cursor but it has a limitation that it is applicable to list 
//implemented classes only and not to other collections.

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorDemo2 {

	public static void main(String[] args) {

		LinkedList ll = new LinkedList();

		ll.add("abc");

		ll.add("def");

		ll.add("ghi");

		ll.add("jkl");

		System.out.println(ll);

		ListIterator lit = ll.listIterator();

		while (lit.hasNext()) {

			String value = (String) lit.next();

			if (value.equals("abc"))
				lit.remove();

			else if (value.equals("def"))
				lit.add("pqr");

			else if (value.equals("ghi"))
				lit.set("xyz");

		}
		
		System.out.println(ll);

	}

}
