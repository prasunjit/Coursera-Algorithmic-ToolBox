import java.util.Scanner;

public class Change {
    private static int getChange(int n) {
        //write your code here
    	
        int  count =0, tempCount = 0;
        while(n!=0){
        	
        	if(n >= 10){
        		tempCount = n/10;
        		n = n % 10;
        		count = count + tempCount;
        		if(n==0)
        			break;
        	}
        	if( n >= 5 && n < 10){
        		tempCount = n/5;
        		n = n % 5;
        		count = count + tempCount;
        		if(n == 0)
        			break;
        	}
        	if(n >= 1 && n < 5){
        		count = count + n;
                break;
        	}
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(getChange(n));

    }
}

