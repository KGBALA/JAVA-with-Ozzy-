
public class CalculatingTime {

	public static void main(String[] args) {

		String h = "10:20:30";
		String[] h1 = h.split(":");

		int hour = Integer.parseInt(h1[0]);
		int min = Integer.parseInt(h1[1]);
		int sec = Integer.parseInt(h1[2]);

		int result = sec + (min * 60) + (hour * 60 * 60);

		System.out.print(result);

	}
}
