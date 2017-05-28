package guvi;

public class MainClass {

	public static void main(String[] args) throws Exception{
		java.io.BufferedReader read = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
		System.out.println(new StringBuilder(read.readLine().trim().toString()).reverse());
	}

}
