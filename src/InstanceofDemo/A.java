package InstanceofDemo;

class B {
	
	
	public void display()
	{
		System.out.println("Displaying from B");
	}

}

class A extends B {
	
	public void display()
	{
		//System.out.println("Displaying from A");
	}

public static void main(String[] args) {

//		A Obj = new A();
//
//		A Obj2 = new B();

//		System.out.println(Obj instanceof A);
//
//		System.out.println(Obj2 instanceof A);

		// B Obj3 = new A(); // this will throw a compile time error

		// B Obj3 = (B) new A(); // Adding cast of class B will resolve the compile time
		// error but will throw a runtime error : Classcast exception

		A Obj1 = new A();
		B Obj4 = (B) Obj1;
		
		Obj4.display();

	}

}
