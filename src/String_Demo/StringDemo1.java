//https://www.journaldev.com/20819/string-programs-in-java
//https://www.javatpoint.com/java-string-faqs
//https://javarevisited.blogspot.com/2012/10/10-java-string-interview-question-answers-top.html

package String_Demo;

public class StringDemo1 {

	public static void main(String[] args) {

		String s1 = new String("Java"); // String class object is immutable

		String s2 = s1.concat(" Course");

		System.out.println(s1);
		System.out.println(s2);
		
		String s5 = "Java";
		
		System.out.println(s1.equals(s5));
		
		
		StringBuffer s3 = new StringBuffer("Selenium");
		
		StringBuffer s4 = new StringBuffer("SeleniumData");
		
		
		s3.append(" Automation"); // StringBuffer class object is mutable
		
		System.out.println(s3);
		
		System.out.println(s3.equals(s4));
		

	}

}
