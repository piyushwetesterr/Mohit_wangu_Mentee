package String_Demo;

public class StringDemo12 {
	
	public static void main(String[] args) {
		
		final StringBuffer sb = new StringBuffer("data");
		
		sb.append("software");
		
		
		System.out.println(sb);
		
		
		sb = new StringBuffer("not_allowed"); // CTE as sb is final declared above
		
		
		//final variable : valid
		
		//final object : invalid
		
		//immutable variable : invalid
		
		//immutable object : valid
		
		
	}

}
