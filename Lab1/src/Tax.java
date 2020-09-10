import java.util.Scanner;
public class Tax {
	
	public static void main(String[] args) {
		double income;
		int filingStatus = 0;
		int[] singleTiers = new int[] {9700, 39475, 84200, 160725,204100, 510300};
		int[] headTiers = new int[] {13850,52850,84200,160700,204100,510300};
		int[] jointlyTiers = new int[] {19400,78950,168400,321450,408200,612350};
		int[] separatelyTiers = new int[] {9700, 39475,84200, 160725,204100, 306175};
		int[] applicableTiers;
		double[] taxRates = new double[] {.10, .12, .22,.24,.32,.35,.37};
		Scanner scanner = new Scanner(System.in);
		System.out.print("How are you filing today?	1 for Single" + "\n"
				+ "				2 for Head of Household" + "\n"
				+ "				3 for Married Filing Jointly or Qualifying Widow" + "\n"
				+ "				4 for Married Filing Separately");
		filingStatus = scanner.nextInt();
		while (filingStatus < 1 || filingStatus > 4) {
			System.out.println("Invalid Filing status");
			System.out.println("Select your marital Status:");
			System.out.println("1) Single");
			filingStatus = scanner.nextInt();
		}
		System.out.println("How much did you make this year?");
		income = scanner.nextDouble();
		while (income <= 0) {
			System.out.println("Invalid number");
			System.out.println("How much did you make this year?");
			income = scanner.nextInt();
		}
		switch (filingStatus) {
			case 1:	applicableTiers = singleTiers;
					break;
			case 2:	applicableTiers = headTiers;
					break;
			case 3:	applicableTiers = jointlyTiers;
					break;
			case 4:	applicableTiers = separatelyTiers;
					break;
			default:
				applicableTiers = new int[]{};
		}
		int i;
		double total = 0;
		for (i = 0; i < applicableTiers.length; i++) {
			if (income <= applicableTiers[i]) {
				total += (applicableTiers[i] - income) * taxRates[i];
			} else {
				total += applicableTiers[i] * taxRates[i];
			}
		}
	}
	
	
}
