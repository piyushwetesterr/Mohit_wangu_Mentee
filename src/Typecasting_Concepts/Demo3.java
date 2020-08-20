package Typecasting_Concepts;

class ParentA {

	public void m1() {

	}

}

class Child extends ParentA {

	public void m2() {

	}

}

class Test_X {

	public static void main(String[] args) {

		Child child = new Child();

		child.m1();
		child.m2();

		((ParentA) child).m1();
		//((ParentA) child).m2(); // CTE

	}

}