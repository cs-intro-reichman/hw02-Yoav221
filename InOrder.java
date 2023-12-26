/**
 * Generates and prints random integers in the range [0,10),
 * as long as they form a non-decreasing sequence.
 */
public class InOrder {
	public static void main(String[] args) {
		int c = 0;

		while (true) {
			int randomNumber = (int) (Math.random() * 10);

			if (randomNumber > c) {
				System.out.print(randomNumber + "  ");
				c = randomNumber;

			} else {
				break;
			}

		}

	}
}
