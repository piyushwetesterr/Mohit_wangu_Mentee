package String_Demo;

public class StringDemo7 {

	public static void main(String[] args) {

		//String name = "Rohit";

		//for (int i = 0; i < name.length(); i++)

			//System.out.print(name.charAt(i));

		//JSystem.out.println();

		//name = name.concat(" Wangu");

		//name = name+"Wangu";
		
		//name+="Wangu";
		
		//System.out.println(name);
		
		
		String uc = "MOHIT";
		String lc = "mohit";
		
		
		System.out.println(uc.equals(lc));
		System.out.println(uc.equalsIgnoreCase(lc));
		
		
		System.out.println(uc.isEmpty());
		
		
		int length = uc.length();    // length() is used on string and length is for arrays
		
		char[] name = uc.toCharArray();
		
		System.out.println(name.length);
		
		System.out.println(length);
		
		

	}

}
