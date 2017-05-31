package guvi;

public class EvenOddSwap {
	public static String evenOddSwap(String str){
		char temp;
		char[] temp1 = str.toCharArray();
		for(int i=0;i<temp1.length-1;i+=2){
			temp = temp1[i];
			temp1[i] = temp1[i+1];
			temp1[i+1] = temp;
		}
		return new String(temp1);
	}
	public static void main(String[] args) throws Exception{
		java.io.BufferedReader read = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
		System.out.println(evenOddSwap(read.readLine().trim().toString()));
	}
}

