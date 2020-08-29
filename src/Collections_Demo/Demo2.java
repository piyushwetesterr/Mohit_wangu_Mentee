package Collections_Demo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.RandomAccess;

public class Demo2 {
	
	public static void main(String[] args) {
		
		
		ArrayList al = new ArrayList();
		LinkedList ll = new LinkedList();
		
		System.out.println(al instanceof Serializable); // True
		System.out.println(al instanceof Cloneable); // True
		System.out.println(ll instanceof Serializable); //True
		System.out.println(ll instanceof Cloneable); // True
		System.out.println(al instanceof RandomAccess); //True
		System.out.println(ll instanceof RandomAccess); // False
		
		// if the most frequent operation to be done is retrieval of data then
		// arrayList is the best choice
		
		
		//whereas if the most frequent operation is the addition/removal of data from
		//the middle of existing data, then in that case array list is not advisable 
		//because all the data would need to be shifted right or left
		
		
		//https://javahungry.blogspot.com/2018/09/top-50-java-string-interview-questions-and-answers.html
		
		
		
		
	}

}
