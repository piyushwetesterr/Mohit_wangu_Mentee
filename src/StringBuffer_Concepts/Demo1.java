package StringBuffer_Concepts;

public class Demo1 {

	public static void main(String[] args) {

		// Important Constructors
		// initial capacity of a stringbuffer object is 16 characters. when that capacity is surpassed then a new object is created with capacity : 
		//==>(initial_capacity+1)*2

		StringBuffer sb = new StringBuffer();

		System.out.println(sb.capacity());

		sb.append("ABCDEFGHIJKLMNOP");

		System.out.println(sb.capacity());

		sb.append("Q");

		System.out.println(sb.capacity());

		sb.append("ABCDEFGHIJKLMNOP");

		sb.append("Q");

		System.out.println(sb.capacity());
		
		sb.append("ABCDEFGHIJKLMNOP");

		sb.append("Q");
		
		System.out.println(sb.capacity());

	}
	
	
	

}
