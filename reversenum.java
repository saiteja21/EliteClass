import java.io.BufferedReader;
import java.io.InputStreamReader;
public class MainClass {

	public static void main(String[] args) throws Exception{
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(new StringBuilder(read.readLine().trim().toString()).reverse());
	}

}
