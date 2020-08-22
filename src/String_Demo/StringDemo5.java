package String_Demo;

public class StringDemo5 {

	public static void main(String[] args) {

		String s1 = new String("You cannot change Me");
		String s2 = new String("You cannot change Me");
		System.out.println(s1 == s2); //false

		String s3 = "You cannot change Me";
		System.out.println(s1 == s3); //false

		String s4 = "You cannot change Me";
		System.out.println(s3 == s4); //true

		String s5 = "You cannot " + "change Me"; //as both are constants new object won't be created in this case so entry will be made is SCP area only
		System.out.println(s4 == s5); // true 

		String s6 = "You cannot "; // s6 will be new entry in scp
		String s7 = s6 + "change Me";// s7 will be result of variable +constant, so new object s7 will be in heap
		System.out.println(s4 == s7); //false

		final String s8 = "You cannot ";
		String s9 = s8 + "change Me";
		System.out.println(s4 == s9); //s9 will be in SCP as both are constants

	}

}

//false
//false
//true
//true
//false
//true

/* SCP concept is available for String class but not for StringBuffer as String is the most utilized class of the two
 * SCP lets the String objects to be re-used and this benefits the performance. 
 * Whenever an existing String object is modified in any way a new reference should be made to point to the modified object; Original object stays same.
 * -> Hence String objects are immutable and StringBuffer objects are mutable
 * 
 * All Wrapper class objects are mutable -> String , Integer , Byte, Short , Float, Double , Character, Boolean etc
 * 
 * 
 * 
 */

