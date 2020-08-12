package Inheritance;

public class Bus extends Vehicles {
	
	public void maxspeed()
	{
		System.out.println("Buses have a max speed upto 200kmph");
	}
	
	public void startengine()
	{
		System.out.println("Buses don't have a button to start engine");
	}
	
	public void fuel()
	{
		
		System.out.println("Buses run on petrol and diesel both");
	}
	

	public static void main(String[] args) {
		
		Vehicles vObj = new Bus();
		
		vObj.fuel();
		vObj.maxspeed();
		vObj.startengine();
		
		System.out.println(vObj.busBrand);
		
		Vehicles vObj2 = new Vehicles();
		
		vObj2.fuel();
		vObj2.maxspeed();
		vObj2.startengine();
		
		System.out.println(vObj2.busBrand);
		

	}

}
