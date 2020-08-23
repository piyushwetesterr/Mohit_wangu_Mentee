package StringBuilder_Concepts;

// All methods in StringBuffer class are synchronized. Hence only a single thread can operate at a time; To resolve this problem, StringBuilder class was 

// introduced from Java 1.5 version onwards.

// all methods and constructors of StringBuffer class are replicated in the StringBuilder class.

// StringBuilder class is the non-synchronized version of the StringBuffer class

//Hence StringBuffer is thread safe while StringBuilder is not

public class Demo1 {

	public static void main(String[] args) {

		StringBuilder sb = new StringBuilder("Mohit");

		sb.append(" Wangu").append(" is").insert(3, true).deleteCharAt(5).delete(2, 5);

		System.out.println(sb);

	}

}
