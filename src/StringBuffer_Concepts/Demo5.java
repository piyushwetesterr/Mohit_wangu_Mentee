package StringBuffer_Concepts;

public class Demo5 {

	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer("ABCDEFghijkl");

		//1
		sb.setLength(6);

		System.out.println(sb);
		
		sb.setLength(20);
		
		System.out.println(sb);
		
		sb.append("MONSTER");
		
		System.out.println(sb);

		StringBuffer sb2 = new StringBuffer();

		System.out.println(sb2.capacity());

		//2
		sb2.ensureCapacity(1000);

		System.out.println(sb2.capacity());

		StringBuffer sb3 = new StringBuffer(1000);

		System.out.println(sb3.capacity());

		sb3.append("ABCD");

		System.out.println(sb3.capacity());

		//3 
		sb3.trimToSize();

		System.out.println(sb3.capacity());

	}

}
