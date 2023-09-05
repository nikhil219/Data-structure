
public class SubArrayfinding {


	/* Returns true if the there is
a subarray of arr[] with sum equal to
	'sum' otherwise returns false.
Also, prints the result */
	int subArraySum(int arr[], int n, int sum)
	{
		int currentSum = arr[0], start = 0, i;

		// Pick a starting point
		for (i = 1; i <= n; i++) {
			// If currentSum exceeds the sum,
			// then remove the starting elements
			while (currentSum > sum ) {
				currentSum = currentSum - arr[start];
				start++;
			}

			// If currentSum becomes equal to sum,
			// then return true
			if (currentSum == sum) {
				int p = i - 1;
				System.out.println(
					"Sum found between indexes " + start
					+ " and " + p);
				return 1;
			}

			// Add this element to curr_sum
			if (i < n)
				currentSum = currentSum + arr[i];
		}

		System.out.println("No subarray found");
		return 0;
	}

	public static void main(String[] args)
	{
		SubArrayfinding arraysum = new SubArrayfinding();
		int arr[] = {1, 4, 20, 3, 10, 5};
		int n = arr.length;
		int sum = 33;
		arraysum.subArraySum(arr, n, sum);
	}
}

// This code has been contributed by Mayank
// Jaiswal(mayank_24)
