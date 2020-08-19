package Overriding_Concepts; // using final modifier

class Demo4 {

	public final void m1() // method is final so over-riding is not permitted
	{

	}

}

class Child1 extends Demo4 {

	public final void m1() // due to final modifier in the parent class,
							// over-riding is not allowed in child even if we change child type to final
	{

	}

}

class Demo5 {

	public void m2() {

	}

}

class Demo6 extends Demo5 {

	public final void m2() { // can over-ride the method of the parent class as final but then further over-rides would not be allowed

	}

}