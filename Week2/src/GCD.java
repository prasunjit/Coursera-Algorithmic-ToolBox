import java.util.*;

public class GCD {
	private static int gcd(int a, int b) {
		/*
		 * int current_gcd = 1; for(int d = 2; d <= a && d <= b; ++d) { if (a %
		 * d == 0 && b % d == 0) { if (d > current_gcd) { current_gcd = d; } } }
		 */
		int rem = 0;
		if (a > b) {

			rem = a % b;
			while (rem != 0) {
				a = b;
				b = rem;
				rem = a % b;
			}
			return b;
		} else {
			rem = b % a;
			while (rem != 0) {
				b = a;
				a = rem;
				rem = b % a;
			}
			return a;
		}
		// return current_gcd;
	}

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();

		System.out.println(gcd(a, b));
	}
}
