import java.util.Scanner;

public class Userinput {

	public static void main(String[] args) {
	
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter a byte value");
		byte b1=scan.nextByte();
		
		
		System.out.println("Enter a short value");
		short s1=scan.nextShort();
		
		System.out.println("Enter a int");
		int i1=scan.nextInt();
		
		System.out.println("Enter boolean");
		boolean bool1=scan.nextBoolean();
		
		System.out.println(b1+"|"+s1+"|"+i1+"|"+bool1);
		

	}

}
