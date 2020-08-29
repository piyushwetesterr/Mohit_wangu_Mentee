package Collections_Demo;  // Iterator Examples

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo3 {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();

		{

			al.add('M');
			al.add('1');
			al.add('N');
			al.add('5');
			al.add('O');
		}

		System.out.println(al);

		Iterator itr = al.iterator();

		while (itr.hasNext()) {

			char ch = (char) itr.next();

			if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))

			{
				System.out.print(" " + ch);
			}

			else
				itr.remove(); // remove() method is additional method as compared to enum
		}

		// System.out.println(al);

	}

}


// by using Enumeration and Iterator we can only move in forward direction
// backward direction movement is not possible hence these are single direction cursors



/*
 *by using iterator we can perform read and remove operation and we can't perform replacement of
 *new objects 
 */

//to handle above limitation we can go for ListIterator





















