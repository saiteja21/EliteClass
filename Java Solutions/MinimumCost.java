package AnandSirClass;

public class MinimumCost {
	//Entry point for this is x,y	
	public static void customEntry(int x,int y,int A[][],int B[][]){
		for(int i=x;i<5;i++){
        	for(int j=y;j<4;j++){
          		if(j==y){
        			if(i==x){
        				 B[i][j] = A[i][j]; 
        			}
        			else{
        				B[i][j] = B[i-1][j] + A[i][j]; 
        			}			
        	    }
        		if(i==x){
        			if(j!=y){
        			   B[i][j] = B[i][j-1] + A[i][j]; 
        			}   
        		}
        		if(i!=x && j!=y){
        			if(B[i][j-1]<B[i-1][j]){
        				B[i][j] = B[i][j-1] + A[i][j]; 
        			}else{
        				B[i][j] = B[i-1][j] + A[i][j];
        			}
         		}
        	}
        }
	    System.out.println("custom entry point at: " + x + " : "+ y);	
		for(int i=x;i<5;i++){
        	for(int j=y;j<4;j++){
        		System.out.print(B[i][j]+"  ");
        	}System.out.println();
        }System.out.println();
		
        System.out.println("Minimum cost from entry point: " + B[4][3]);
		
	}
	//Entry point for this is 0,0
	public static void minimum(int A[][],int B[][]){
		for(int i=0;i<5;i++){
        	for(int j=0;j<4;j++){
          		if(j==0){
        			if(i==0){
        				 B[i][j] = A[i][j]; 
        			}
        			else{
        				B[i][j] = B[i-1][j] + A[i][j]; 
        			}			
        	    }
        		if(i==0){
        			if(j!=0){
        			   B[i][j] = B[i][j-1] + A[i][j]; 
        			}   
        		}
        		if(i!=0 && j!=0){
        			if(B[i][j-1]<B[i-1][j]){
        				B[i][j] = B[i][j-1] + A[i][j]; 
        			}else{
        				B[i][j] = B[i-1][j] + A[i][j];
        			}
         		}
        	}
        }
		
		for(int i=0;i<5;i++){
        	for(int j=0;j<4;j++){
        		System.out.print(B[i][j]+"  ");
        	}System.out.println();
        }System.out.println();
		
        System.out.println("Minimum: " + B[4][3]);
    }

	public static void main(String[] args) {
        int A[][] = {{1,2,1,3},
        		    {1,2,1,4},
        		    {6,1,3,2},
        		    {7,1,1,2},
        		    {8,1,9,4}
                   };
        int B[][] = new int[5][4];
        int C[][] = new int[5][4];
        System.out.println();
        
        minimum(A,B);
        customEntry(1, 1, A, C);//Enter at 1,1
  }
}
