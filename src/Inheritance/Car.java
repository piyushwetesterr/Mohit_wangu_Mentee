package Inheritance;

public class Car extends Vehicles {
	
	private String brandname;
	
	private int yearofmake;
	
	private int price;
	
	
	public void setYear(int year)
	{
		yearofmake = year;
	}
	
	
	public void setBrand(String brand)
	{
		
		brandname = brand;
		
	}
	
	
	public void setPrice(int price)
	{
		this.price = price;
	}
	

	public static void main(String[] args) {
		
		
		Car carObj = new Car();
		
		carObj.fuel();
		carObj.maxspeed();
		carObj.startengine();
		
		carObj.setYear(1987);
		carObj.setBrand("Maruti");
		carObj.setPrice(2000000);
		
		System.out.println("Details of the car : ");
		
		System.out.println(carObj.yearofmake);
		System.out.println(carObj.brandname);
		System.out.println(carObj.price);
		
		
		

	}

}
