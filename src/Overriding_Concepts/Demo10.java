package Overriding_Concepts; // change of visibility

//private<default<protected<public

//public->public
//protected->public,protected
//default->default,protected,public
//private->NOT APPLICABLE FOR PRIVATE

class Demo10 {

	public void m() {

	}

}

class Demo11 extends Demo10 {

	protected void m() // reduction of visibility is not permitted
	{

	}

}

class Demo12 {

	protected void m() {

	}

}

class Demo13 extends Demo12 {

	public void m() // widening of visibility is permitted; same as in case of interfaces
	{

	}

}
