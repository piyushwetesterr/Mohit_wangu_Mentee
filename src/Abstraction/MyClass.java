package Abstraction;

public class MyClass extends MathFunctions {

	public static void main(String[] args) {

		MathFunctions mfn = new MathFunctions();

		System.out.println(mfn.add(3, 4));

		System.out.println(mfn.divide(12, 6));

		System.out.println(mfn.multiply(2, 5));

		System.out.println(mfn.subtract(6, 1));

	}

}
