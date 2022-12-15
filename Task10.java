
public class Task10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		
		Car car = new Car("Opel","Astra",50);
	}

}

class Car {
	private String brand, model;
	private int amountOfFuel;

	Car()
	{
		brand = "";
		model = "";
		amountOfFuel = 0;
		
	}
	
	Car(String brand1, String model1, int amountOfFuel1) 
	{	
		brand = brand1;
		model = model1;
		amountOfFuel = amountOfFuel1;
		printData();
	}
	
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
	
	public String getModel() 
	{
		return model;
	}
	
	public void setModel(String model)
	{
		this.model = model;
	}
}
