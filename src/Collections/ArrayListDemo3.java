package Collections;  // Iterator Examples

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
				itr.remove();
		}

		// System.out.println(al);

	}

}
