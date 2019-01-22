
public class Car {

	
	 String model;
 String body;
	private int size;
	private int weight;
	private int doors;
	private double mil;
	
	
	public void  Drive() {
		System.out.println("Car is driviable");
		
	}
	public Car(String model, String body, int size, int weight, int doors,double mil) {
		super();
		this.model = model;
		this.body = body;
		this.size = size;
		this.weight = weight;
		this.doors = doors;
		this.mil=mil;
		
	}

}
