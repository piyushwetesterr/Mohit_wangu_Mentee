package BasicConcepts;

public class ValidateUser extends EmployeeData {

	public void passwordValidate(EmployeeData obj) {
		if (obj.getPassword() == "1234" || obj.getPassword() == "3456") {

			System.out.println("Verified Employee");
		}
		
		else
			
			System.out.println("Invalid Credentials");

	}

	public static void main(String[] args) {

		EmployeeData ed1 = new EmployeeData("Chandra", 1020, "Delhi", "Male");
		ed1.setPassword("12345");
		ed1.displayemp(ed1, 1);
		ValidateUser v1 = new ValidateUser();
		v1.passwordValidate(ed1);

		EmployeeData ed2 = new EmployeeData("Rajan", 1021, "Punjab", "Male");
		ed2.setPassword("34567");
		ed2.displayemp(ed2, 2);
		v1.passwordValidate(ed2);

	}

}
