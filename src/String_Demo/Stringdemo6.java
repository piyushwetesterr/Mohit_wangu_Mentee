package String_Demo;

public class Stringdemo6 {

	public static void main(String[] args) {

//		String s1 = new String(" ");
//		
//		System.out.println(s1.length());
//		
//		String s2 = new String("name"); //String Literal
//		

		// String name = new StringBuffer("Check");

		// StringBuffer name = new String("Check");

		//StringBuilder sb1 = new StringBuilder();

		//String name = new String(sb1);

		//StringBuilder sb2 = new StringBuilder();
		
		//String name2 = new String(sb2);

		System.out.println("Char to String");

		char[] ch = { 'J', 'A', 'V', 'A' };

		String name3 = new String(ch); // String constructor with Char

		// System.out.println(name3);

		char[] ch1 = name3.toCharArray();

		for (char c : ch1) {

			System.out.print(c);
		}

		System.out.println();

		System.out.println("reverse the string : ");

		String given = "JAVA IS A PROGRAMMING LANGUAGE";

		char[] ch3 = given.toCharArray();

		System.out.println();

		for (int i = ch3.length - 1; i >= 0; i--) {
			System.out.print(ch3[i]);
		}

		System.out.println();
		System.out.println("Byte to string");
		byte[] b = { 97, 98, 99, 100 };
		String name4 = new String(b); // String constructor with byte
		System.out.println(name4);

	}

}
