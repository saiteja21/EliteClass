package AnandSirClass;

public class TotalNumberOfPaths {

	public static void maxFor(int B[][]){
		for(int i=0;i<5;i++){
			for(int j=0;j<1;j++){
				if(i==0 && j==0)
					B[0][0] = 0;
				else
				    B[i][j] = 1;
			}
		}
		for(int i=0;i<1;i++){
			for(int j=0;j<4;j++){
				if(i==0 && j==0)
					B[0][0] = 0;
				else
				    B[i][j] = 1;
			}
		}
		for(int i=1;i<5;i++){
			for(int j=1;j<4;j++){
				B[i][j] = B[i][j-1]+B[i-1][j];
			}
		}
		for(int i=0;i<4;i++){
			for(int j=0;j<4;j++){
				System.out.print(B[i][j] + " ");
			}System.out.println();
		}
	}

	public static void main(String arsg[]){
		int B[][] = new int[5][4];
		maxFor(B);
	}
		
}
