package AnandSirClass;

public class Minimum {
	static public int min=0;
	public static int min(int arr[],int min,int i){
		if(i==arr.length){
			return min;
		}
		if(arr[i]<min){
			min = arr[i];
		}
		return min(arr,min,i+1);
	}

	public static void main(String[] args) {
		int arr[]= {2,14,6,1,90};   
		min = arr[0];
		System.out.println(min(arr,min,1));       	   
	}
	
}
