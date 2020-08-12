package AbstractDemo;

public class ImplementingClass2 extends BaseClass {

	@Override
	public float SetInterestrate() {

		return 0.15f;
	}

	@Override
	public float SetDiscountRate() {

		return 0.205f;
	}

	public static void main(String[] args) {

		System.out.println("Calculated amount : ");
		
		ImplementingClass2 obj = new ImplementingClass2();
		
		float intr = obj.SetInterestrate();
		
		float disc = obj.SetDiscountRate();
		
		float final_Amt = intr*disc*principal_amount;
		
		System.out.println(final_Amt);

	}

}
