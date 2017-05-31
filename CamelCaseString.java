package guvi;

public class CamelCaseString {
	static public String camelCaseString(String str){
		String arr[] = str.split(" ");    
	    String result=arr[0].toLowerCase();
	    for(int i=1;i<arr.length;i++){
	    	result+=arr[i].substring(0, 1).toUpperCase()+arr[i].substring(1).toLowerCase();
	    }
		return result;
	}
	public static void main(String[] args) throws Exception{
		java.io.BufferedReader read = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));   
        String arr = read.readLine().trim().toString();    
	    System.out.println(camelCaseString(arr));
        
	}
}