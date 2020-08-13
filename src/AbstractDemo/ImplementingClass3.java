package AbstractDemo;

public class ImplementingClass3 extends ImplementingClass1 {
	
	
	public float SetDiscountRate() {
		
		return 0.25f;
	}
	
	public static void main(String[] args) {
		
		
		ImplementingClass3 obj = new ImplementingClass3();
		
		float discount = obj.SetDiscountRate();
		
		float interest = obj.SetInterestrate();
		
		float final_amt = discount*interest*principal_amount;
		
		
		System.out.println(discount);
		System.out.println(interest);
		System.out.println(principal_amount);
		
		
		System.out.println(final_amt);
		
		
		
	}
	

}
