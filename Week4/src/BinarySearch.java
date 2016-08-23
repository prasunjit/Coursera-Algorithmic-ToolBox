import java.io.*;
import java.util.*;

public class BinarySearch {

    static int binarySearch(int[] a, int x) {
        int left = 0, right = a.length;
        //write your code here
        int mid;
        if(right < left)
        	return left -1;
        while(left < right){
        	mid = left + (right - left)/2;
        	if(x == a[mid])
        		return mid;
        	 if (x < a[mid]) {
        		 //if you write right = mid -1 the the below problem arises
        		 /*
				   Input:
						10 2 3 4 5 6 7 8 9 10 11
						1 3
						
						Your output:
						-1  
						Correct output:
						1 
						
						solution
						This all depends on how you update your left and right variable.
						Normally, we use left = middle+1 and right = middle-1, with stopping criteria left = right.
						In this case, ceiling or flooring the middle value doesn't matter.
						However, if we use left = middle+1 and right = middle, we must take the floor of the middle value, otherwise we end up in an endless loop.
						Consider finding 11 in array 11, 22.
						We set left = 0 and right = 1, the middle is 0.5, if we take the ceiling, it would be 1. Since 22 is larger than query, we need to cut the right half and move right boarder towards middle. This works fine when the array is large, but since there are only two elements. right = middle will again set right to 1. We have an infinite loop.
						To sum up,
						both ceiling and flooring work fine with left = middle+1 and right = middle-1
						ceiling works fine with left = middle and right = middle-1
						flooring works fine with left = middle+1 and right = middle
        		  */
				right = mid;
			}if(x>a [mid]) {
				left = mid +1;
			}
        }
        return -1;
    }

    static int linearSearch(int[] a, int x) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == x) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        FastScanner scanner = new FastScanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int m = scanner.nextInt();
        int[] b = new int[m];
        for (int i = 0; i < m; i++) {
          b[i] = scanner.nextInt();
        }
        for (int i = 0; i < m; i++) {
            //replace with the call to binarySearch when implemented
            System.out.print(binarySearch(a, b[i]) + " ");
        }
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
