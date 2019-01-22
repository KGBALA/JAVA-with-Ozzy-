import java.util.Arrays;
import java.util.Scanner;

public class ArrayClass {

	public static void main(String[] args) {
	
		int []myIntArray=new int[10];
		myIntArray[0]=35;
		myIntArray[1]=20;
		
		int[]myIntArray2= {1,23,34,5,6};
		//System.out.println(myIntArray[2]+ "|"+ myIntArray2[4]);
         int [] myIntegers=getIntegers(3);
         System.out.println("The average is: "+ getAverage(myIntegers));
         System.out.println(Arrays.toString(myIntegers));
	}
    public static int[] getIntegers( int numbers) {
    	
    	Scanner scan=new Scanner(System.in);
    	System.out.println("Please enter a new number");
    	int []values=new int[numbers];
      for (int i=0;i<values.length;i++) {
    	  values[i]=scan.nextInt();
    	  
      }
      return values;
    	}
    public static double getAverage(int[] array) {
    	int sum=0;
    	for (int i=0; i<array.length;i++) {
    		sum=sum+array[i];
    	}
    	return (double)sum/array.length;
    }

    }

