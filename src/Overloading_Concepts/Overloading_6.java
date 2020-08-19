package Overloading_Concepts;

class Animal {

}

class Monkey extends Animal {

}

class Test {

	public void m1(Animal a) {
		System.out.println("Animal Version");
	}

	public void m1(Monkey m) {
		System.out.println("Monkey Version");

	}

	public static void main(String[] args) {

		Test t = new Test();

		Animal a = new Animal();

		t.m1(a); // direct call to the parent type reference

		Monkey m = new Monkey();

		t.m1(m); // direct call to the child type reference

		Animal a1 = new Monkey();

		t.m1(a1); // this will also call the parent type method as in overloading the call is decided on the basis of the reference type only
				  // and not the run time object

	}

}
