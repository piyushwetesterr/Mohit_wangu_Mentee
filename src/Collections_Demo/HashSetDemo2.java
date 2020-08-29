package Collections_Demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;

public class HashSetDemo2 {
	
	
	public static void main(String[] args) {
		
		
		String question = "MMOOOHHHITTT";
		
		char[] ch = question.toCharArray();
		
		
		HashSet hs = new HashSet();
		
		
		for(int i= 0; i < ch.length; i++)
		{
			
			hs.add(ch[i]);
			
		}
		
		ArrayList al = new ArrayList(hs);
		
		Collections.sort(al);

		System.out.println(al);
		
	}

}
