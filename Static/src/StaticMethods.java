
public class StaticMethods {

	public static void main(String[] args) {

		Abc.show1();
		Abc.show4();

		Abc x = new Abc();
		x.show2();

		Math.round(4);

		Math x1 = new Math();
		x1.random();

	}

}

class Abc {
	public static void show1() {
		System.out.println("Hi");
		show4();
	}

	public void show2() {
		System.out.println("Hi");
		show3();
	}

	public void show3() {
		System.out.println("Hi");
		show1();

	}

	public static void show4() {
		System.out.println("Hi");
		show1();
	}
}

class Math {
	public static void round(int num) {
		System.out.println("Bye");
	}

	public void random() {
		System.out.println("instance method");
	}
}