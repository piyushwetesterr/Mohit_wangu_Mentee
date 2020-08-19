package MultilevelInheritance;

public class TestClass {

	public static void main(String[] args) {
		
		
//		A a = new A();
//		
//		a.display();
//		
//		B b = new B();
//		
//		b.display();
//		
//		C c = new C();
//		
//		c.display();
//		
//		A a1 = new B();
//		
//		B b = (C) a1;
//		
//		((C) a1).display();
//		
		
		///////////////////
		
		
		A a2 = new C();
		
		//a2.display();
		
		C c2 = (C)a2;
		
		c2.display();
		
		//((C) a2).display();
		
		
		

	}

}
