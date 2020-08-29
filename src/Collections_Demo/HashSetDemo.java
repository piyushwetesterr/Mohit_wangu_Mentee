package Collections_Demo;

import java.util.ArrayList;
import java.util.HashSet;

//Set is the child interface of Collection. 

// If we want to represent a group of objects as a single entity where the order is not important
// but we do not want duplicates, then in this case we should use Set.

//Underlying data structure is HashTable
//Duplicate values are not permitted
//nulls can be inserted
//Search is very efficient and if our most frequent operation is Search then it is the best choice
//Insertion order is not preserved and objects are inserted based on HashCodes

public class HashSetDemo {

	public static void main(String[] args) {
		
		
		HashSet h = new HashSet();
		
		HashSet h1 = new HashSet(200); // constructor with initial capacity included
		
		HashSet h2 = new HashSet(300,0.95f); // constructor with initial capacity and load factor
		// default value of load factor is 0.75 but we can add custom value as seen above
		// Load Factor means after filling by how much %age of the HashSet a new object would be 
		//created
		
		
		ArrayList al = new ArrayList(); // convert collection to HashSet
		
		HashSet h3 = new HashSet(al); 

		
		h.add("A");
		h.add("B");
		
		h.add(null);
		
		h.add(10);
		
		
		Boolean adder = h.add("B");
		System.out.println(adder);
		
		System.out.println(h);
		
		
		
		
		
	}

}
