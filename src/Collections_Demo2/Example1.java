package Collections_Demo2;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.RandomAccess;
import java.util.Vector;

public class Example1 {
	
	public static void main(String[] args) {
		
		ArrayList l1 = new ArrayList();
		LinkedList l2 = new LinkedList();
		Vector v3 = new Vector();
		
		
		System.out.println(l1 instanceof Serializable);
		System.out.println(l2 instanceof Serializable);
		System.out.println(v3 instanceof Serializable);
		
	
		System.out.println(l1 instanceof Cloneable);
		System.out.println(l2 instanceof Cloneable);
		System.out.println(v3 instanceof Cloneable);
	
		
		System.out.println(l1 instanceof RandomAccess);
		System.out.println(l2 instanceof RandomAccess);
		System.out.println(v3 instanceof RandomAccess);
	
		
		
		
	}

}
