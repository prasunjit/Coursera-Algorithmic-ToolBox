import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;


public class MaxPairwiseProduct {

	static long getMaxPairwiseProduct(long[] numbers) {
        long result = 0;
        int n = numbers.length;
        int max_index1 = -1;
        for (int i = 0; i < n; ++i) {
        	if(max_index1 == -1 || (numbers[i] > numbers[max_index1]))
        		max_index1 = i;
        	
        }
        
        int max_index2 = -1;
            for (int j = 0; j < n; ++j) {
                if ((j != max_index1) && ((max_index2 ==-1)|| (numbers[j]> numbers[max_index2]))) {
                    max_index2 = j;
                }
            }
        result = ((long)(numbers[max_index1]))* numbers[max_index2];
        return result;
    }

    public static void main(String[] args) {
    	
        FastScanner scanner = new FastScanner(System.in);
        int n = scanner.nextInt();
        long[] numbers = new long[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
       
        
        System.out.println(getMaxPairwiseProduct(numbers));
    }

    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        FastScanner(InputStream stream) {
            try {
                br = new BufferedReader(new InputStreamReader(stream));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
    }
}
