package Overriding_Concepts; // co-variant return types

class Parent {

	public Object display() {

		System.out.println("Parent Call");
		return null;
	}

}

class Child extends Parent {
	public String display() { // display method is being overridden in the child class using co-variant return type
							 // also the co-variant return types can be parent to child only and not parent to child
								// i.e Parent class method can have an Object type and child class method can have String type but vice-versa is not allowed

		System.out.println("Child call");
		return "abcd";

	}

}

class Grandchild extends Parent {

	public StringBuffer display() // display method is being overridden in the child class using covariant return
									// type which is permitted onwards from Java version 1.5
	
									//MEANING : return types of overridden methods can be having a parent child re
	{
		System.out.println("Grandchild calling");
		
		return null;

	}

}

class Test {

	public static void main(String[] args) {

		Parent p = new Parent();

		Child c = new Child();

		Parent pp = new Child();

		Grandchild gc = new Grandchild();

		p.display();// direct call to parent class method

		c.display();// direct call to child class method

		pp.display(); // at compile time, the display method should be present in Parent and at run
						// time the JVM checks the runtime object type and decides which method is to be
						// called

		gc.display();

	}

}
