package Typecasting_Concepts;

class Parent {

}


class Base1 extends Parent
{
}


class Base2 extends Parent
{ 
	
}

class Der1 extends Base1
{
	
}

class Der2 extends Base1
{
	
}

class Der3 extends Base2
{
	
}

class Der4 extends Base2
{
	
}


class Test
{
	
	public static void main(String[] args) 
	{
		
		
		Base2 b = new Der4();
		
		Der4 d= (Der4)b; //legal
		
		//Base1 b1 = (Base1)b; // compilation error
		
		Base2 b2 = (Base2)b; // legal
		
		//Object O = (Der3)b; // runtime exception : classcast
		
		//Base2 b3 = (Base1)b; // compilation error
		
		
		
		
		
		
		
		
	}

	


}




