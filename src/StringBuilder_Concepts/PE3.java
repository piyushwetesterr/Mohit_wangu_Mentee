package StringBuilder_Concepts;

public class PE3 {
	
	public static void main(String[] args) {
		
		
		StringBuilder sb = new StringBuilder("PursuitOfHappYness");
		
		//sb.deleteAll(); // no such method
		
		//sb.delete(0,sb.size()); // no such method
		
		sb.delete(0,sb.length());
		
		//sb.removeall(); // no such method

		System.out.println(sb);
		
	}

}
