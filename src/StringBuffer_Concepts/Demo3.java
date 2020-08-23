package StringBuffer_Concepts;

/*
 * important methods of StringBuffer class
 */

public class Demo3 {

	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer("software");

		// 1
		int length = sb.length();

		//System.out.println(length);

		// 2
		int capacity = sb.capacity();

		//System.out.println(capacity); // capacity is 24 -> 16+8

		// 3

		char ch = sb.charAt(3);

		//System.out.println(ch);

		// char ch1 = sb.charAt(35); //exception // StringIndexOutOfBoundsException

		// 4

		sb.setCharAt(3, 'B');

		//System.out.println(sb);

		StringBuffer sb2 = new StringBuffer();

		sb2.append(" Value of PI is ");

		sb2.append(3.14);

		sb2.append(" This is exactly ");

		sb2.append(true);

		System.out.println(sb2);

	}

}
