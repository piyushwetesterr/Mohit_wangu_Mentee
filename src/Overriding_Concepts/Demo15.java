package Overriding_Concepts; // method hiding : here method call depends 
							//on reference type decided by compiler(only for method hiding)

// for overriding the rule is that the method call is decided based on the run time object


class Demo15 {

	public static void mm() {

		System.out.println("Parent");
	}

}

class Demo16 extends Demo15 {

	public static void mm() { // no overriding; this is method hiding
		
		System.out.println("Child");

	}

}


class Test_Class
{
	
public static void main(String[] args) {
	
	Demo15 dd= new Demo15();
	
	dd.mm();
	
	
	Demo16 dd1 = new Demo16();
	
	dd1.mm();
	
	
	Demo15 dd2 = new Demo16();
	
	dd2.mm();
	
}

}
