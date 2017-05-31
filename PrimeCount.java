package guvi;

import java.math.BigInteger;

public class MainClass {
	public static int primeCount(int m,int n){
		int count =0;
		for(;m<=n;m++){
			if(new BigInteger(Integer.toString(m)).isProbablePrime(999)){
				count++;	
			}
		}
		return count;
	}
	public static void main(String[] args) throws Exception{
		java.io.BufferedReader read = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
		System.out.println(primeCount(Integer.parseInt(read.readLine().toString()),Integer.parseInt(read.readLine().toString())));
	}
}

