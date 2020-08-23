package StringBuffer_Concepts;

public class Demo6 {
	
	public static void main(String[] args) {
		
		
		StringBuffer sb = new StringBuffer("Mohit");
		
		
		sb.append(" Wangu").append(" is").insert(3, true).deleteCharAt(5).delete(2, 5);
		
		System.out.println(sb);
		
	}
	

}
