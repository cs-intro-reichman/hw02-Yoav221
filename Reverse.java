/**
 * Prints a given string, backward. Then prints the middle character in the
 * string.
 * The program expects to get one command-line argument: A string.
 */
public class Reverse {
	public static void main(String[] args) {
		String s = args[0];
		String reverse = "";

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			reverse = ch + reverse;

		}
		int midIndex = s.length() / 2;
		System.out.println(midIndex);
		char midChar = s.charAt(midIndex);
		System.out.println(reverse);
		System.out.println("The middle character is: " + midChar);
	}
}
