package String_Demo;

public class StringDemo10 {
	
	public static void main(String[] args) {
		
		
		String s1 = new String("india"); // new heap and scp object
		
		String s2 = s1.toUpperCase(); // new heap object
		
		String s3 = s1.toLowerCase(); // no change on s1 as already lowercase so no new object
									 // s1 and s3 point to same object (applies to both heap & SCP)	
		
		
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		
	}

}
