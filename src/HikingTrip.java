import java.util.*;

class HikingTrip {

	public static int findMinRec(int arr[], int i, int sumCalculated, int sumTotal) {

		if (i == 0)
			return Math.abs((sumTotal - sumCalculated) - sumCalculated);

		return Math.min(findMinRec(arr, i - 1, sumCalculated + arr[i - 1], sumTotal),
				findMinRec(arr, i - 1, sumCalculated, sumTotal));
	}

	public static int findMin(int arr[], int n) {

		int sumTotal = 0;
		for (int i = 1; i <= n; i++)
			sumTotal += arr[i];

		return findMinRec(arr, n, 0, sumTotal);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        while(scanner.hasNextLine()) {
        	String[] tokens = scanner.nextLine().split("\\s+");
			int n = Integer.parseInt(tokens[0]);
			if(n ==0){
				return ;
			}
			//System.out.println("tokens"+tokens.length);
			int arr[] = new int[tokens.length];
			for (int i = 1; i < tokens.length; i++) {
				int inputValue = Integer.parseInt(tokens[i]);
				arr[i] = inputValue;
			}

			int minDiff = findMin(arr,n);
			int sumTotal = 0;
			for (int i = 1; i <= n; i++) {
				sumTotal += arr[i];
			}
			int first = ((sumTotal - minDiff) / 2);
			int second = (sumTotal - first);
			System.out.println();
			System.out.println(second + " " + first);
		}
		scanner.close();
	}

}
