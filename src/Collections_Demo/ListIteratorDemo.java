package Collections_Demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

//ListIterator can perform the following actions : 

/*
 * move forward
 * move backward
 * replacement of object
 * add object
 * read and remove (these are possible from iterator also)
 * 
 * ListIterator is the child interface of Iterator
 */

public class ListIteratorDemo {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();
		
		Iterator itr = al.iterator();

		ListIterator ltr = al.listIterator();
		
		
		
		/*forward movement*/
		
		//ltr.hasNext();
		
		//ltr.next();
		
		//ltr.nextIndex();
		
		
		
		/*backward movement*/
		
		//ltr.hasPrevious();
		
		//ltr.previous();
		
		//ltr.previousIndex();

		
		/*additional useful methods*/
		
//		ltr.add(e);
//		
//		ltr.set(e); 
//		
//		ltr.remove();

		al.add("Mohit");

		al.add("Wangu");

		System.out.println(al);
	}

}
