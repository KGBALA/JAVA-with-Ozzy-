
public class Main2 {
	
	public String name;
	public int age;
	public String breed;
	public String color;
	
	public void Dog3() {
	
		Dog dog3=new Dog();
		name="Puppy";
		color="Grey";
		age=8;
	    breed="Simple";
	    
	

		
		this.name=name;
		this.color=color;
		this.age=age;
	    this.breed=breed;
		
		System.out.println(dog3.name + ":"+dog3.age+":"+dog3.breed+":"+dog3.color);
		
		dog3.bark();
		dog3.eat();
		dog3.bark();
	}

}
