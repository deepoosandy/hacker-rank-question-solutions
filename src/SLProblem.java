import java.math.BigDecimal;
import java.util.Scanner;

public class SLProblem {

	public static void main(String[] args) {
		System.out.println(new SLProblem().averageCal());
	}

	public BigDecimal averageCal() {
		int totalMinsDisplay = 0;
		double average = 0;
		BigDecimal roundedWithScale = new BigDecimal(0.0);

		Scanner scanner = new Scanner(System.in);
		int totalLines = scanner.nextInt();
		int count = -1;
		if (totalLines >= 1 && totalLines <= 1000) {

			while (totalLines > count && scanner.hasNextLine()) {

				String[] tokens = scanner.nextLine().split("\\s+");
				if (!"".equalsIgnoreCase(tokens[0]) && !"".equalsIgnoreCase(tokens[1])) {

					if (1 <= Integer.parseInt(tokens[0]) && Integer.parseInt(tokens[0]) <= 60
							&& 1 <= Integer.parseInt(tokens[1]) && Integer.parseInt(tokens[1]) <= 3600) {
					
						totalMinsDisplay += Integer.parseInt(tokens[0]);
						average += Math.abs((Double.valueOf(tokens[1]) / 60));
					} else {
						System.out.println("Invalid input");
					}
				}

				count++;

			}

			scanner.close();
			BigDecimal bigDecimal = new BigDecimal((average / totalMinsDisplay));
			roundedWithScale = bigDecimal.setScale(9, BigDecimal.ROUND_HALF_UP);
		} else {
			System.out.println("Invalid input");
		}
		if (BigDecimal.valueOf(1).doubleValue() > roundedWithScale.doubleValue()) {
			System.out.println("measurement error");
		}

		return roundedWithScale;
	}

}
