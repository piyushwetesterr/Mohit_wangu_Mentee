package Typecasting_Concepts;

class A {

	public static void m() {

		System.out.println("A");

	}

}

class B extends A {
	public static void m() {
		System.out.println("B");

	}

}

class C extends B {
	public static void m() {
		System.out.println("C");

	}

}

class Caller {
	public static void main(String[] args) {

		C c = new C();
		c.m();

		((B) c).m();

		((A) ((B) c)).m();

		// as the m() is being over-ridden in all classes, the method call shall be
		// resolved according to the runtime object which is of C as per line no 32
		
		// if methods are made static, then this will be method hiding concept and calls 
		// shall be resolved as per the reference type

	}

}