package BasicConcepts;

public class EmployeeData {

	String name;
	int empID;
	String address;
	String gender;
	private String password;
	
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public EmployeeData()
	{
		this.name = "";
		this.empID = 0;
		this.address = "";
		this.gender = "";
		
	}

	public EmployeeData(String name, int empID, String address, String gender) {
		this.name = name;
		this.empID = empID;
		this.address = address;
		this.gender = gender;

	}

	public void displayemp(EmployeeData obj, int empSequence) {
		System.out.println("=====employee "+empSequence+" details======");
		System.out.println(obj.name);
		System.out.println(obj.empID);
		System.out.println(obj.address);
		System.out.println(obj.gender);
		
		

	}

	public static void main(String[] args) {

		

	}

}
