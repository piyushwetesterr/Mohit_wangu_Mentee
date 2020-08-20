package Typecasting_Concepts; 

// for variable overriding is not possible so as an overloading type
// resolution is done on the basis of the reference

class A1 {

	int x = 777;

}

class B1 extends A1 {
	int x = 888;
}

class C1 extends B1 {
	int x = 999;
}

class Calling {

	public static void main(String[] args) {

		C1 c = new C1();

		System.out.println(c.x);

		System.out.println(((B1) c).x);

		System.out.println(((A1) ((B1) c)).x);

	}

}