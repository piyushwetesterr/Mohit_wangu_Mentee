package Overriding_Concepts; //primitive return types

class ParentClass {

	public double display() {

		System.out.println("Parent Call");
		return 0;
	}

}

class ChildClass extends ParentClass {
	
	public int display() { // co-variant return type combination is allowed on object types only and not on primitive types
								// for primitive return types the return type should be same

		System.out.println("Child call");
		//return "abcd";
		return 0;

	}

}

class GrandchildClass extends ParentClass {

	public StringBuffer display() // co-variant return types are permitted on object types only and not on primitive types
	{								// for primitive return types the return type should be same
		System.out.println("Grandchild calling");
		
		return null;

	}

}

class TestClass {

	public static void main(String[] args) {

		ParentClass p = new ParentClass();

		ChildClass c = new ChildClass();

		ParentClass pp = new ChildClass();

		GrandchildClass gc = new GrandchildClass();

		p.display();// direct call to parent class method

		c.display();// direct call to child class method

		pp.display(); // at compile time, the display method should be present in Parent and at run
						// time the JVM checks the runtime object type and decides which method is to be
						// called

		gc.display();

	}

}
