public class Task10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}
}

class Car {
	String brand, model;
	int amountOfFuel;
	
	
	
	public void brake ()
	{
		System.out.println("Car is breaking");
	}
	
	public void accelerate()
	{
		if (amountOfFuel > 0)
		{
			System.out.println("Car is accelerating");
			amountOfFuel -= 1;
		}
	}
	
	public void printData ()
	{
		
		System.out.println("Brand: " + brand);
		System.out.println("Model: " + model);
		System.out.println("Fuel: " + amountOfFuel);
		
	}
}

