package StringBuffer_Concepts;

public class Demo2 {

	public static void main(String[] args) {

		StringBuffer sb1 = new StringBuffer(); // type 1
		
		//type2
		StringBuffer sb = new StringBuffer(1000);  // create StringBuffer object with preset capacity

		//System.out.println(sb.capacity());

		String s = "durga";
		
		//type3
		StringBuffer sb2 = new StringBuffer(s); // new object capacity = (s.length+16)
												// thus new capacity = 5+16 = 21
		System.out.println(sb2.capacity());
		
	}

}
