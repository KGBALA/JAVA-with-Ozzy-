
public class Febinacci {
	public static void main(String[] args) {
		Febinacci(10);
	}

	public static void Febinacci(int num) {
		int a = 0;
		int b = 1;
		int result;

		for (int i = 0; i < num; i++) {
			System.out.println(a);
			result = a + b;
			b = a;
			a = result;
		}
	}

}
