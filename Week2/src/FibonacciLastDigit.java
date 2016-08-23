import java.util.*;

public class FibonacciLastDigit {
    private static long getFibonacciLastDigit(long n) {
    	long fib01 = 0, fib02 = 1, fib0n = 0,lastDigit=0;
		if (n <= 1)
			return n;
		
		// 0 1 1 2 3 5 8 13 21 34 55

		for (int i = 2; i <= n; i++) {
			fib0n = (fib01 + fib02)%10;  //3 , 1
			fib01 = fib02;               //8,  3
			fib02 = fib0n;               //3,  1
		}
		//lastDigit = fib0n % 10;
		//return lastDigit;
         return fib0n;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long c = getFibonacciLastDigit(n);
        System.out.println(c);
    }
}

