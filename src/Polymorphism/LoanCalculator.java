package Polymorphism;

class loanBase {

	String statement = "Taxes Extra"; // this will not depend on the object but on the reference

	float setInterest() { // this will depend on the object type
		System.out.println("Base Rate");
		return 0.5f;

	}

}

class personalLoan extends loanBase {
	String statement = "No additional taxes";

	float setInterest() {
		System.out.println("Personal Loan");
		return 0.75f;

	}

}

class homeLoan extends loanBase {
	String statement = "Some additional taxes";

	float setInterest() {
		System.out.println("Home Loan");
		return 0.85f;

	}

}

class carLoan extends loanBase {
	String statement = "Many additional taxes";

	float setInterest() {
		System.out.println("Car Loan");
		return 0.95f;

	}

}

class LoanCalculator {

	public static void main(String[] args) {

		loanBase lb1 = new loanBase();
		System.out.println(lb1.setInterest());
		System.out.println(lb1.statement);

		loanBase lb2 = new personalLoan();
		System.out.println(lb2.setInterest());
		System.out.println(lb2.statement);

		loanBase lb3 = new homeLoan();
		System.out.println(lb3.setInterest());
		System.out.println(lb3.statement);

		loanBase lb4 = new carLoan();
		System.out.println(lb4.setInterest());
		System.out.println(lb4.statement);

	}

}
