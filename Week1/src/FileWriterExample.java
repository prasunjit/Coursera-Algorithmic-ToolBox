import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;



public class FileWriterExample {

	public static void main(String[] args) {
		FileWriter fw ;
		FileReader fr;
		Scanner scanner = new Scanner(System.in);
    	BufferedWriter bw = null;
    	BufferedReader br = null;
        int n = scanner.nextInt();
        //String content = "Hi";
        long[] numbers = new long[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        try{
        	fw = new FileWriter("C:/Users/S525074/Desktop/coursera/data.txt");
        	bw = new BufferedWriter(fw);
        	//br.write(content);
        	PrintWriter pr = new PrintWriter(bw);
        	for (int i=0; i< numbers.length; i++){
        		pr.println(String.valueOf(numbers[i]));
        	}
        }catch(IOException ex){
        	System.out.println(ex);                                                                                                                                                                                                                                         
        }
     
        	try {
				fr = new FileReader("C:/Users/S525074/Desktop/coursera/data.txt");
				br = new BufferedReader(fr);
				
					while (br.read()!= -1){
					for(int i=0; i<numbers.length;i++){
						numbers[i] = br.read();
					}
					
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			
        	
        	
        }
        finally{
        	
			if (br != null)
            {
                 try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
            }//end if
			scanner.close();
        }//end finally

	}

}
