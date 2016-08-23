import java.util.*;

class EditDistance {
  public static int EditDistance(String s, String t) {
    //write your code here
	  int m = s.length();
      int n = t.length();
      int[][] d = new int[m + 1][n + 1];
      for (int i = 0; i <= m; i++) {
          d[i][0] = i;
      }
      for (int j = 0; j <= n; j++) {
          d[0][j] = j;
      }
      for (int i = 1; i <= m; i++) {
          for (int j = 1; j <= n; j++) {
              if (s.charAt(i - 1) == t.charAt(j - 1)) {
                  d[i][j] = d[i - 1][j - 1];
              } else {
                  d[i][j] = min((d[i - 1][j] + 1), (d[i][j - 1] + 1),
                          (d[i - 1][j - 1] + 1));
              }
          }
      }
      return (d[m][n]);
  }
  public static int min(int a, int b, int c) {
      return (Math.min(Math.min(a, b), c));
  }
public static void main(String args[]) {
    Scanner scan = new Scanner(System.in);

    String s = scan.next();
    String t = scan.next();

    System.out.println(EditDistance(s, t));
  }

}
