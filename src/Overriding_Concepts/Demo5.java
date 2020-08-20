package Overriding_Concepts;

class Demo7 {

	public void method() {

	}

}

abstract class Demo8 extends Demo7 { //non-abstract method of the parent class can be over-ridden to an abstract type in the child class

	public abstract void method();

}

class Demo9 extends Demo8 { // now the child class of the above abstract class shall provide implementation of the abstract method

	@Override
	public void method() {
		// TODO Auto-generated method stub

	}

}