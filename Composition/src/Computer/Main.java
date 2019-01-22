package Computer;

public class Main {

	public static void main(String[] args) {
		
		Dimensions theDimensions=new Dimensions(20,20,5);
		Case theCase=new Case("2208", "Dell", "240", theDimensions);
		MotherBoard theMotherBoard= new MotherBoard("BJ-200", "ASUS", 4, 6, "2.44");
		Monitor theMonitor=new Monitor("27inch beast", "Acer", 27, new Resolution (2540,1440));
		
	
		PC thePC=new PC(theCase, theMonitor, theMotherBoard);
		thePC.getTheMonitor().drawPixelAt(1500, 1200, "red");
		
		thePC.getTheMotherBoard().loadProgram("MAC OS Mojave");
		
		thePC.getTheCase().pressPowerButton();

	}

}
