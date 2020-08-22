package String_Demo;

public class StringDemo8 {

	public static void main(String[] args) {

		String test = "babababa";

		System.out.println(test.replace('a', 'b'));

		String test1 = "ABC456DEF";

		System.out.println(test1.replaceAll("[0-9]", ""));
		System.out.println(test1.replaceAll("[A-Z]", ""));

		String test2 = "ABC456DEFGHIJ890";

		System.out.println(test2.substring(2, 8));

		System.out.println(test2.substring(5));

		String test3 = "Maggi";
		System.out.println(test3.indexOf('F'));
		System.out.println(test3.lastIndexOf('g'));

		StringBuffer sb = new StringBuffer("Maggi");
		System.out.println(sb.lastIndexOf("gg"));

		StringBuilder sbb = new StringBuilder("Maggi");
		System.out.println(sbb.lastIndexOf("gg"));
		
		
		System.out.println(test2.toLowerCase());
		
		System.out.println(test3.toUpperCase());
		
		String name = "Raman Kumar";
		System.out.println("Value : "+name.trim().length());
		

	}

}
