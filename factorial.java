package guvi;

public class MainClass {

	public static void main(String[] args) throws Exception{
		java.io.BufferedReader read = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
		long n = Long.parseLong(read.readLine().toString());
	    long print=1;
	    for(int i=1;i<=n;i++){
	    	print = print*i;
	    }
	    System.out.println(print);
	}

}
