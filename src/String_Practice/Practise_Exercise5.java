package String_Practice;

public class Practise_Exercise5 {

	public static void main(String[] args) {

		String s1 = "Java";

		String s2 = new String("java");

//		String s3 = s2;
//
//		if (s1 == s3)
		
		if(s1.equalsIgnoreCase(s2)) // this will print 'equal'
		
//		String s3 = s2;
//		
//		if(s1.equals(s3))
		
		
		//if(s1.toLowerCase()==s2.toLowerCase())

		{

			System.out.println("Equal");

		}

		else {
			System.out.println("Not Equal");

		}

	}

}
