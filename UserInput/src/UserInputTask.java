import java.util.Scanner;

public class UserInputTask {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int sum = 0;
		int counter = 1;

		while (counter < 11) {
			System.out.println("Enter a number- " + counter);
			boolean bool = scan.hasNextInt();
			if (bool) {
				counter++;
				int number = scan.nextInt();
				sum = sum + number;
			} else {
				System.out.println("Invalid number");
			}
			scan.nextLine();
		}
		System.out.println(sum);
		scan.close();
	}

}
