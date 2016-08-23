
public class FibonacciTest1 {
      public static void main(String[] args) {
/*		int f0 =0;
		int f1 = 1;
		int f2 = 1;
		int fcurrent=0;
		int fprevious=0;
		int ftemp = 0;
		System.out.print(f0 + " "+f1+ " "+f2+" ");
		for(int i=1; i<8;i++){
			 //0 1 1 2 3 5 8
			if(fcurrent == 0){
				fcurrent = f1 + f2;
				fprevious = f2;
				System.out.println(fcurrent);
			}
			else{
				ftemp = fcurrent;
				fcurrent= fcurrent + fprevious;
				System.out.println(fcurrent);
				fprevious = ftemp;
			}
		}*/
		
		int fib01 = 0, fib02 = 1, fibonaaci =0;
		System.out.print(fib01+ " "+fib02+" ");
		for(int i=2; i<9;i++){
			fibonaaci = fib01 + fib02;
			System.out.print(fibonaaci+" ");
			fib01= fib02;
			fib02= fibonaaci;
		}
	}
}
