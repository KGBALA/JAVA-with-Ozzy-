package MyExampleInheritance;

public class Transport {
	
	private int pilotSeat;
	private int capacity;
	private int turbine;
	private String landRoller;
	private String Army;
	private String citizen;
	
	public void fly() {
		System.out.println("Transport.fly() called");
	}
	
	public void land() {
		System.out.println("Transport.land() called");
	}
	public void transport() {
		System.out.println("Transport.transport() called");
	}
	
	public void autoPilot() {
		System.out.println("Transport.transport() called");
	}
	public int getPilotSeat() {
		return pilotSeat;
	}
	public int getCapacity() {
		return capacity;
	}
	public int getTurbine() {
		return turbine;
	}
	public String getLandRoller() {
		return landRoller;
	}
	public String getArmy() {
		return Army;
	}
	public String getCitizen() {
		return citizen;
	}
	
	

}
