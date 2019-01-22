import java.util.Scanner;

public class SwitchClass {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your number");
		int i = scan.nextInt();
		
		
		
		switch(i%2) {
		case 0:
			System.out.println("number is even");
			break;
			
		case 1:
			System.out.println("Number is odd");
			break;
		}

	}
}
