/**
 * Generates and prints random integers in the range [0,10),
 * as long as they form a non-decreasing sequence.
 */

public class InOrder {
	public static void main(String[] args) {
		int c = 0;
		String result = "";
		while (true) {
			int randomNumber = (int) (Math.random() * 10);
			if (randomNumber > c || (randomNumber == 0 && c == 0)) {
				result = result + randomNumber;
				c = randomNumber;

			} else if (randomNumber <= c) {
				break;
			}

		}
		System.out.println(result);
	}
}
