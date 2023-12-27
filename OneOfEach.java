/**
 * Simulates the formation of a family in which the parents decide
 * to have children until they have at least one child of each gender.
 */

public class OneOfEach {
	public static void main(String[] args) {

		String result = "";
		int boyCounter = 0;
		int girlCounter = 0;
		int total = 0;

		while (true) {
			if (boyCounter > 0 && girlCounter > 0) {
				break;
			} else if (total > 0) {
				result = result + " ";
			}
			double r = Math.random();
			if (r > 0.5) {
				result = result + "g";
				total++;
				girlCounter++;
			} else {
				result = result + "b";
				total++;
				boyCounter++;
			}

		}

		System.out.println(result);
		System.out.println("You made it... and you now have " + total + " children.");

	}
}
