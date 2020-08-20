//https://www.youtube.com/playlist?list=PLFGoYjJG_fqqyIj2ht0aHMx_HnGX3ZFEx&app=desktop

package Typecasting_Concepts;

public class Demo1 {

	public static void main(String[] args) {

		
		//System.out.println("Hello world !!!");
		
		// A b = (C)d;

//		Object name = new String("myname");
//		
//		Object namex = new String("data");

		// StringBuffer sbObj = (StringBuffer)name; // Compile time error

//		String name1 = new String("name");

		// StringBuffer sb1 = (StringBuffer)name1; // compile time error

		// String name2 = new String("name");
		// StringBuffer sb2 = (String)name2; // compile time error

//		Object name3 = new String("name");
//		String s = (String)name3; // this will work as all the conditions are satisfied
//		

//		Object O = new String("Mohit");
//		String s = (String)O;
//		
		String s = new String("name");
		Object o = (Object) s;

		//System.out.println("Welcome");

		System.out.println(s == o);
		System.out.println(o == s);

		Integer i = new Integer(10);
		Number n = (Number) i;

		System.out.println(i == n);
		System.out.println(n == i);

	}

}
