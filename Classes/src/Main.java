
public class Main {

	public static void main(String[] args) {
		
		Dog dog1=new Dog();
		dog1.name="Bubbly";
		dog1.age=5;
		dog1.breed="Poodle";
		dog1.color="white";
		
		System.out.println(dog1.name + ":"+dog1.age+":"+dog1.breed+":"+dog1.color);
		
		dog1.bark();
		dog1.eat();
		dog1.wagTail();
		
		System.out.println("--------------------------------");
		
		TaskConstructor student1=new TaskConstructor("Mike", 25, 'M', 2017, "JAVA");
		student1.attendLecture();
		student1.attendlab();
		student1.submitAssigment();
		
	student1.name="Mike";
	
	TaskConstructor student2=new TaskConstructor("Smith", 26, 'M', 2018, "JAVASCRIPT");
	student2.attendLecture();
	student2.attendlab();
	student2.submitAssigment();
	}

}
