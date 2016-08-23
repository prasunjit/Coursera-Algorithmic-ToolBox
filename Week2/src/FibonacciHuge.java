import java.util.*;

public class FibonacciHuge {
    private static long getFibonacciHuge(long n, long m) {
    	// store moduloes only in one pisano period, but size is unknown
        List<Integer> modulos = new ArrayList<>();
        modulos.add(0);
        modulos.add(1);
        int i = 0;
        // must check both current and next modular
        while(! (i > 0 && modulos.get(i) == 0 && modulos.get(i + 1) == 1)) {
            modulos.add((int) ((
                    modulos.get(  i  ) % m +
                    modulos.get(i + 1) % m ) % m));
            i++;
        }
        // i is currently pisano period; loop to Fn % i again?
        // Time-Space tradeoff: store each value in the period.
        //System.out.println("pisano period=" + i);
        return modulos.get((int) (n % i));
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long m = scanner.nextLong();
        System.out.println(getFibonacciHuge(n, m));
    }
}

