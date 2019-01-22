package TestingMethods;

public class NewTask {

	public static void main(String[] args) {

		double calcMetric = calcFeetAndInchesToCentimeters(5,10);
		System.out.println(calcMetric);
		calcMetric = calcFeetAndInchesToCentimeters(10);
		System.out.println(calcMetric);

	}

	public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
         double cm =2.45;
         
		if (feet < 0 ||(inches < 0 && inches > 12) ) {
			System.out.println("The number has to be more than 0 ");
			return -1;

		} else {
			return  cm * (feet*12);
		}
	

	}

	public static double calcFeetAndInchesToCentimeters(double inches) {
		double feet=0.0833333;
		if (inches < 0) {
			System.out.println("The number has to be more or equal to 0 " + inches);
			return -1;
		}
		return  feet=inches/12;

	}
}
