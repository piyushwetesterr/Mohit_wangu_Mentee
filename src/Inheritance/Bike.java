package Inheritance;

public class Bike extends Vehicles {
	
	
	public void maxspeed()
	{
		System.out.println("Bikes have a max speed upto 200kmph");
	}
	
	public void startengine()
	{
		System.out.println("Bikes have a button to start engine");
	}
	
	public void fuel()
	{
		
		System.out.println("Bikes consumption is very efficient");
	}
	

	public static void main(String[] args) {
		
		Bike bikeObj = new Bike();
		
		System.out.println(bikeObj.bikeBrand);
		
		bikeObj.maxspeed();
		bikeObj.startengine();
		bikeObj.fuel();

	}

}
