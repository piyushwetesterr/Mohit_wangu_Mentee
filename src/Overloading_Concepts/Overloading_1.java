package Overloading_Concepts;

class Loader extends Overloading_1 {
	void meth(char c) {

	}

}

class Overloading_1 {

	// same method name but different arguement types. these are known as overloaded
	// methods

	static void meth() {
		System.out.println("No Args");

	}

	static void meth(int x) {
		System.out.println("int Args");

	}

	// void meth(double x)
//	{
//		System.out.println("double args");
//		
//	}
//	

	void meth(String s) {
		System.out.println("String args");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Overloading_1 ol = new Overloading_1();

		Overloading_1 ol1 = new Loader(); // we have overloaded the
											// method in the child class but the reference
											// type is parent so method can't be called

		Loader l2 = new Loader();

		// l2.meth('x'); // now reference is of child type so child class method can be
		// called

		// ol.meth();

		ol.meth('a'); // no method definition for char type in parent class but
						// implicit type conversion is done to 'int'

		// byte->short->int->long->float->double
		// char->int->long->float->double // automatic promotion in overloading

		// ol.meth(10.55d); // no further promotion for double type so CTE

//		ol.meth(10);
//		ol.meth(10.5);
//		ol.meth("Sloping");		

	}

}

//in overloading the resolution of the methods is taken care of by compiler itself based on the 
//reference type but not based on the runtime object 

//Overloading is also known as Compile time polymorphism or static polymorphism or early binding

//can we overload static methods and abstract methods?
