import java.util.Scanner;
public class Tax {
	
	public static void main(String[] args) {
		float income;
		int fillingStatus = 0;
		int[] singleTiers = new int[] {9700, 39475, 84200, 160725,204100, 510300};
		int[] headTiers = new int[] {13850,52850,84200,160700,204100,510300};
		int[] jointlyTiers = new int[] {19400,78950,168400,321450,408200,612350};
		int[] separatelyTiers = new int[] {9700, 39475,84200, 160725,204100, 306175};
		double[] taxRates = new double[] {.10, .12, .22,.24,.32,.35,.37};
		Scanner scanner = new Scanner(System.in);
		System.out.println("Select your marital Status:");
		System.out.println("1) Single");
		fillingStatus = scanner.nextInt();
		while (fillingStatus < 1 || fillingStatus > 4) {
			System.out.println("Invalid Filling status");
			System.out.println("Select your marital Status:");
			System.out.println("1) Single");
			fillingStatus = scanner.nextInt();
		}
	}
	
	
}
