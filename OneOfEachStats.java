import java.util.Random;

public class OneOfEachStats {
	public static void main(String[] args) {
		// Gets the two command-line arguments
		int T = Integer.parseInt(args[0]);
		int seed = Integer.parseInt(args[1]);
		// Initializes a random numbers generator with the given seed value
		Random generator = new Random(seed);
		int twoChild = 0;
		int threeChild = 0;
		int fourChildOrMore = 0;
		int totalChildern = 0;

		for (int i = 1; i <= T; i++) {
			int boyCounter = 0;
			int girlCounter = 0;
			int total = 0;

			while (true) {
				if (boyCounter > 0 && girlCounter > 0) {
					break;
				}
				double rnd = generator.nextDouble();
				if (rnd > 0.5) {
					total++;
					girlCounter++;
				} else {
					total++;
					boyCounter++;
				}
			}
			totalChildern += total;
			if (total == 2) {
				twoChild++;
			} else if (total == 3) {
				threeChild++;
			} else if (total >= 4) {
				fourChildOrMore++;
			}
		}
		double average = (double) totalChildern / T;
		int common = Math.max(twoChild, Math.max(threeChild, fourChildOrMore));

		System.out.println("Average: " + average + " children to get at least one of each gender.");
		System.out.println("Number of families with 2 children: " + twoChild);
		System.out.println("Number of families with 3 children: " + threeChild);
		System.out.println("Number of families with 4 or more children: " + fourChildOrMore);

		String mostCommonChildren = "";
		if (common == fourChildOrMore) {
			mostCommonChildren += "4 or more.";
		} else if (common == threeChild) {
			mostCommonChildren += "3.";
		} else if (common == twoChild) {
			mostCommonChildren += "2.";
		}
		System.out.println("The most common number of children is " + mostCommonChildren);
	}
}
