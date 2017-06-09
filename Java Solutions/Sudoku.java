package AnandSirClass;

public class Sudoku {
    final int UNASSIGNED =0;
    final int N = 9;
	
    boolean UsedInRow(int grid[][], int row, int num)
    {
        for (int col = 0; col < N; col++)
            if (grid[row][col] == num)
                return true;
        return false;
    }
    
    boolean UsedInCol(int grid[][], int col, int num)
    {
        for (int row = 0; row < N; row++)
            if (grid[row][col] == num)
                return true;
        return false;
    }
    
    boolean UsedInBox(int grid[][], int boxStartRow, int boxStartCol, int num)
    {
        for (int row = 0; row < 3; row++)
            for (int col = 0; col < 3; col++)
                if (grid[row+boxStartRow][col+boxStartCol] == num)
                    return true;
        return false;
    }
    
    boolean isSafe(int grid[][], int row, int col, int num)
    {
        /* Check if 'num' is not already placed in current row,
           current column and current 3x3 box */
        return !UsedInRow(grid, row, num) &&
               !UsedInCol(grid, col, num) &&
               !UsedInBox(grid, row - row%3 , col - col%3, num);
    }
    
    void printGrid(int grid[][])
    {
        for (int row = 0; row < N; row++)
        {
           for (int col = 0; col < N; col++)
                 System.out.print(grid[row][col] + " ");
            System.out.println();
        }
    }
    int[] FindUnassignedLocation(int grid[][])
    {
    	int a[] = new int[3]; 
        int row=0,col=0;
    	for (row = 0; row < N; row++)
            for (col = 0; col < N; col++)
                if (grid[row][col] == UNASSIGNED){
                	a[0]=1;
                	a[1]=row;
                	a[2]=col;
                	return a;
                }
        a[0]=0;
    	return a;
     }
    
    boolean SolveSudoku(int grid[][])
    {
    	int ar[] = FindUnassignedLocation(grid);
        
            
        // If there is no unassigned location, we are done
        if (ar[0]!=1)
           return true; // success!
        int row= ar[1], col=ar[2];      
        // consider digits 1 to 9
        for (int num = 1; num <= 9; num++)
        {
            // if looks promising
            if (isSafe(grid, row, col, num))
            {
                // make tentative assignment
                grid[row][col] = num;
     
                // return, if success, yay!
                if (SolveSudoku(grid))
                    return true;
     
                // failure, unmake & try again
                grid[row][col] = UNASSIGNED;
            }
        }
        return false; // this triggers backtracking
    }
	public static void main(String[] args) {
		int grid[][] = {{3, 0, 6, 5, 0, 8, 4, 0, 0},
                {5, 2, 0, 0, 0, 0, 0, 0, 0},
                {0, 8, 7, 0, 0, 0, 0, 3, 1},
                {0, 0, 3, 0, 1, 0, 0, 8, 0},
                {9, 0, 0, 8, 6, 3, 0, 0, 5},
                {0, 5, 0, 0, 9, 0, 6, 0, 0},
                {1, 3, 0, 0, 0, 0, 2, 5, 0},
                {0, 0, 0, 0, 0, 0, 0, 7, 4},
                {0, 0, 5, 2, 0, 6, 3, 0, 0}};
        Sudoku s = new Sudoku();
		if (s.SolveSudoku(grid) == true)
           s.printGrid(grid);
        else
           System.out.println("No solution exists");
	}
}
