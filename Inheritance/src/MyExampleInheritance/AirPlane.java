package MyExampleInheritance;

public class AirPlane extends Transport{

	private int length;
	private int width;
	private int seats;
	private String model;
	private String type;
	private int numPlane;
	
	@Override
	public void autoPilot() {
		System.out.println("Airplane.autoPilot() called");
	}
	
	public void canStrike() {
		System.out.println(" Airplane.canStrike() called");
	}
	
	public void superSonicSpeed() {
		System.out.println("AirPlane.superSonicSpeed() called");
	}
	
	@Override
	public void fly() {
		System.out.println("AirPlane.fly() called");
	}
	
	public int getLength() {
		return length;
	}
	public int getWidth() {
		return width;
	}
	public int getSeats() {
		return seats;
	}
	public String getModel() {
		return model;
	}
	public String getType() {
		return type;
	}
	public int getNumPlane() {
		return numPlane;
	}
	
}
