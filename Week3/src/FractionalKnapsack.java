import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class FractionalKnapsack {
	private static double getOptimalValue(double capacity, double[] values,
			double[] weights) {
		double value = 0;
		// write your code here
		int size = values.length;
		double[][] valuePerWeight = new double[size][2];
		for (int i = 0; i < size; ++i) {
			valuePerWeight[i][0] = values[i] / weights[i];
			valuePerWeight[i][1] = weights[i];
		}
		java.util.Arrays.sort(valuePerWeight,
				new java.util.Comparator<double[]>() {
					public int compare(double[] a, double[] b) {
						return Double.compare(a[0], b[0]);
					}
				});
		System.out.println();

		int i = size - 1;
		while (capacity > 0 && size > 0) {
			if (valuePerWeight[i][1] > capacity) {
				value += capacity * valuePerWeight[i][0];
				capacity = 0;
			} else {
				if(size ==1)
					return values[i];
				value += valuePerWeight[i][1] * valuePerWeight[i][0];
				capacity -= valuePerWeight[i][1];
			}
			--i;
		}

		return value;
	}

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int capacity = scanner.nextInt();
		double[] values = new double[n];
		double[] weights = new double[n];
		for (int i = 0; i < n; i++) {
			values[i] = scanner.nextInt();
			weights[i] = scanner.nextInt();
		}
		System.out.printf("%.4f",getOptimalValue(capacity, values, weights));
	}
}
