package Overriding_Concepts; // this is a case of overloading and not over-riding as the methods have different signatures so method call will be as per reference

class Demo17 {

	public int display(int... i) {
		System.out.println("Parent");
		return 0;
	}

}

class Demo18 extends Demo17 {
	public int display(int i) { // as this method is not var-arg type so there is no over-riding here but overloading instead; if changed to var-arg it will be
								//over-riding
		System.out.println("Child");
		return i;

	}

}

class Test_Check {
	public static void main(String[] args) {

		Demo17 dd = new Demo17();

		dd.display(10,20);

		Demo18 dd2 = new Demo18();
		
		dd2.display(10);

		Demo17 dd3 = new Demo18();

		dd3.display(15);
	}

}
