import java.util.Scanner;

public class Main {

	private static Scanner scanner = new Scanner(System.in);
	private static GroceryList groceryList = new GroceryList();

	public static void main(String[] args) {

		boolean quit = false;

		int choise = 0;
		printInstructions();
		while (!quit) {
           System.out.println("Enter your choise:");
           choise=scanner.nextInt();
            scanner.nextLine();
            
            switch(choise) {
            case 0:
            	printInstructions();
            	break;
            case 1:
            	groceryList.printGroceryList();
            	break;
            case 2:
            	addItem();
                break;
            case 3:
            	modifyItem();
            	break;
            case 4:
            	removeItem();
            	break;
            case 5:
            	searchForItem();
            	break;
            case 6:
            	quit=true;
            	break;
            	
            }
		}

	}

	private static void searchForItem() {
		// TODO Auto-generated method stub
		
	}

	private static void removeItem() {
		// TODO Auto-generated method stub
		
	}

	private static void modifyItem() {
		// TODO Auto-generated method stub
		
	}

	private static void addItem() {
		// TODO Auto-generated method stub
		
	}

	private static void printInstructions() {
		// TODO Auto-generated method stub
		
	}

}
