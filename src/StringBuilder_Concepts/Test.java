package StringBuilder_Concepts;

class MyString {

	String msg;

	MyString(String msg) {
		this.msg = msg;

	}

	public String toString()
	{
		
		return msg;
	}
	
}

public class Test

{
	public static void main(String[] args) {

		System.out.println("Hello " + new StringBuilder("Java SE 8"));

		System.out.println("Hello " + new MyString("Java SE 8"));

	}

}

//when we try to print a reference, if the class has toString method , then it will be called, but if it does not then the Object class toString method is called
//this will print the className and some hashcode


// so we need to override the toString method in order to overcome this issue