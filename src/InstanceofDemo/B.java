package InstanceofDemo;

class Parent {
	void display() {
		System.out.println("Parent");
	}
}

class Child extends Parent {

	void display() {
		System.out.println("Child");
	}

	static void checkInstance(Parent p) {
		
		Child c2 = new Child();
		
		System.out.println(p instanceof Child);
		System.out.println(c2 instanceof Parent);
		System.out.println(p instanceof Parent);
		System.out.println(c2 instanceof Child);
		
		if (p instanceof Child) {
			Child c = (Child) p;
			c.display();
		}

		// p.display();

	}

	public static void main(String[] args) {

		Parent pObj = new Child();
		
		//Child pObj = new Parent();

		Child.checkInstance(pObj);

	}

}
