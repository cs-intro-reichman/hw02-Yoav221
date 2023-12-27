/**
 * Gets a command-line argument (int), and chekcs if the given number is
 * perfect.
 */

public class Perfect {
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		int sum = 1;
		String result = n + " is a perfect number since " + n + " = " + 1;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0 && i != 1 && n != i) {
				result = result + " + " + i;
				sum += i;
			}
		}

		if (sum == n) {
			System.out.println(result);
		} else {
			System.out.println(n + " is not a perfect number");
		}
	}

}