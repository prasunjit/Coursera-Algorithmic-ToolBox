import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class FileTest {

	public static void main(String[] args) throws IOException {
		FileWriter fr = new FileWriter("C:/Users/S525074/Desktop/coursera");
		BufferedWriter br = new BufferedWriter(fr);
		String content = " Hi";
	}

}
