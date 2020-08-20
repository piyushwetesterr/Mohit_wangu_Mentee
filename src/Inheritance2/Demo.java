

package Inheritance2;

class Parent {

	static public void m1() {

		System.out.println("PARENT m1");
	}

}

class Child extends Parent {

	public void m2() {
		
		System.out.println("CHILD m2");

	}
	
	
	static public void m1()
	{
		System.out.println("CHILD m1");
		
		
	}

}


class GChild extends Parent
{
	static public void m1()
	{
		System.out.println("GCHILD m1");
		
		
	}


}


class Demo {

	public static void main(String[] args) {
		
		System.out.println("Parent Reference calls");
		Parent p = new Parent();
		p.m1();
		//p.m2(); CTE
		System.out.println();
		
		
		System.out.println("Child Reference calls");
		Child c = new Child();
		c.m1();
		c.m2();
		System.out.println();
		
		System.out.println("Parent class reference call to child class method due to over-riding");
		Parent pp = new Child();
		pp.m1(); // this will call the child class method m1
		
		Parent pg = new GChild();
		pg.m1(); // this will call the gchild method
		

	}

}
