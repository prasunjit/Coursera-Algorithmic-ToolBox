import java.util.Scanner;

public class Fib {
	private static long calc_fib(int n) {
		int fib01 = 0, fib02 = 1, fibonaaci = 0;
		if (n <= 1)
			return n;

		for (int i = 2; i <= n; i++) {
			fibonaaci = fib01 + fib02;
			fib01 = fib02;
			fib02 = fibonaaci;
		}
		// return calc_fib(n - 1) + calc_fib(n - 2);
		return fibonaaci;

	}

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();

		System.out.println(calc_fib(n));
	}
}
