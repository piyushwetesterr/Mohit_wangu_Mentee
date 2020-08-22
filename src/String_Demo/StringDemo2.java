package String_Demo;

public class StringDemo2 {

	public static void main(String[] args) {

		String s1 = new String("Mohit");
		String s2 = new String("Mohit");
		String s3=s2;

		System.out.println(s1.equals(s2)); //Compares values as it has been over-ridden : hence True

		System.out.println(s1 == s2); // references : Compares references and hence it is FALSE due to new reference creation
		
		System.out.println(s3 == s2); // references : // references : Compares references and hence it is FALSE

		StringBuffer sb1 = new StringBuffer("Lakshit");
		StringBuffer sb2 = new StringBuffer("Lakshit");
		StringBuffer sb3 = sb2;
		
		
		System.out.println(sb1.equals(sb2)); //False as new reference has been created

		System.out.println(sb1 == sb2); //False as new reference has been created
		
		System.out.println(sb3 == sb2); //True as references are being compared

		
		/*
		 * Object class is the parent of both String and StringBuffer class which has the equals method or '=='
		 * Basically in both the classes '==' and 'equals' are supposed to be used for comparing references
		 * Now in String class, the equals method has been overridden to compare values, hence the '==' is still used to compare references   
		 * 
		 * But in case of StringBuffer, there is no over-riding of equals method so both '==' and equals do the same work i.e compare references
		 * Hence the above results
		 * 
		 */
		
		
	}

}
