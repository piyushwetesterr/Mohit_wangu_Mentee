package Overriding_Concepts;

class Demo7 {

	public void method() {

	}

}

abstract class Demo8 extends Demo7 {

	public abstract void method();

}

class Demo9 extends Demo8 {

	@Override
	public void method() {
		// TODO Auto-generated method stub

	}

}