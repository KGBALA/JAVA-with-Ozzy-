
public class Main {

	public static void main(String[] args) {
		
		Engine e1=new Engine();
		Honda h1=new Honda("Red", 240, e1);
		//another way 
		//Honda h1=new Honda("Red", 240, new Engine());
		
		h1.carInfo();
		h1.startHonda();
		
	}

}
