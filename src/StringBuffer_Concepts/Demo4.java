package StringBuffer_Concepts;

import java.lang.reflect.Array;

public class Demo4 {

	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer("soware");

		sb.insert(2, "ft");

		sb.insert(3, false);

		sb.insert(4, 'c');

		sb.insert(5, 10);

		System.out.println(sb);
		
		//soffc10alsetware
		
		sb.delete(5, 9); // deletes from begin index to end-1 index
		
		System.out.println(sb);
		
		//soffcsetware
		
		sb.deleteCharAt(4);
		
		System.out.println(sb);
		
		//soffsetware
		
		sb.reverse();
		
		System.out.println(sb);
		
		
		StringBuffer sentence = new StringBuffer("Java Is a Programming Language");
		
		sentence.reverse();
		
		System.out.println(sentence);
		
		String data = "Java Is a Programming Language";
		
		char [] ch = data.toCharArray(); // print it in reverse to reverse the strings
		
		
		
		
		
		
		
		
		
		
		

	}

}
