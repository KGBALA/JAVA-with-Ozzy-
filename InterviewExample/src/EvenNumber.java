
public class EvenNumber {

	public static void main(String[] args) {

		int startNum = 10;
		int finishNum = 100;
		int evenNumFound = 0;
		while (startNum <= finishNum) {
			if (!isEvenNumber(startNum)) {
				startNum++;
				continue;

			}

			System.out.println("Even number" + startNum);
			startNum++;
			evenNumFound++;
			if (evenNumFound >= 5) {
				break;
			}

		}

	}

	public static boolean isEvenNumber(int num) {

		if ((num % 2) == 0) {
			return true;
		} else {
			return false;
		}

	}
}
