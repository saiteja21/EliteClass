package AnandSirClass;

public class PoliceAndThief {
	public static void maxForThief(int A[][],int B[][]){
		for(int i=0;i<5;i++){
			for(int j=0;j<1;j++){
				B[i][j] = A[i][j];
			}
		}int k=1;
		for(int i=0;i<5;i++){
			for(int j=k;j<4;j++){
				if(i==0){
					B[i][j] = maxOfThree(B[i][j], B[i+1][j-1], 0) + A[i][j];
					break;
				}	
				else if(i==4){
					B[i][j] = maxOfThree(B[i][j-1], 0, B[i-1][j-1]) + A[i][j];
					break;
				}else{
					B[i][j] = maxOfThree(B[i][j-1], B[i+1][j-1], B[i-1][j-1]) + A[i][j];
					break;
				}
			}
			if(k==4){
				break;
			}else if(i==4){
				i=-1;
				k++;
			}
		}
		for(int i=0;i<5;i++){
			for(int j=0;j<4;j++){
				System.out.print(B[i][j]+"  ");
			}System.out.println();
		}System.out.println();
		int max=0;	
		for(int i=0;i<5;i++){
			for(int j=3;j<4;j++){
				if(B[i][j]>max){
					max = B[i][j];
				}
			}
		}System.out.println("Maximum money for Thief: " + max);
	}
	public static int maxOfThree(int x,int y,int z){
		if ( x > y && x > z )
	         return x;
	      else if ( y > x && y > z )
	         return y;
	      else if ( z > x && z > y )
	         return z;
	      else
	    	 return x; 
	}
	public static void main(String[] args) {
		int A[][] = {{1,2,1,3},
    		    {1,2,1,4},
    		    {6,1,3,2},
    		    {7,1,1,2},
    		    {8,1,9,4}
               };
        int B[][] = new int[5][4];
        maxForThief(A, B);
        
    }

}
