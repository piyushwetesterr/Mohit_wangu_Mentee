package Single_Inheritance;

public class TestClass {

	public static void main(String[] args) {
		
		A a = new A();
		B b = new B();
		A a1 = new B(); // upcasting
		
		//B b1 = (B) new A();// this compiles correctly but throws a runtime error
		
		A a2 = new B(); // downcasting is achieved in this way
		B b2 = (B) a2;
		
		
		A a3 = new A();
		B b3 = (B)a3; //classcast exception
		
		

		a.makeSound(); // calls the A class method
		b.makeSound(); // calls the B class method
		a1.makeSound();// shows the A class method at compile time but at run time it calls
					   // the B class method as it has been overridden in the child class
		
		//b1.makeSound(); // this wont execute due to runtime error at line 11
		
		b2.makeSound(); //this method is in both child class and parent class
		b2.listenSound(); // this method is unique to the child class and can be now called using b2 which has been downcasted from a2 
		
		b3.listenSound();
		b3.makeSound();
		
		
//output
		/*
		  A Class method
		  B Class method
          B Class method
          B Class method
		*/
		
		
	}

}
