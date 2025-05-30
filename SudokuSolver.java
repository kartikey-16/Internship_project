package sudoku;

public class SudokuSolver {
	   static final int SIZE = 9; // 9x9 grid

	    public static void main(String[] args) {
	        int[][] board = {
	            {5, 3, 0, 0, 7, 0, 0, 0, 0},
	            {6, 0, 0, 1, 9, 5, 0, 0, 0},
	            {0, 9, 8, 0, 0, 0, 0, 6, 0},
	            {8, 0, 0, 0, 6, 0, 0, 0, 3},
	            {4, 0, 0, 8, 0, 3, 0, 0, 1},
	            {7, 0, 0, 0, 2, 0, 0, 0, 6},
	            {0, 6, 0, 0, 0, 0, 2, 8, 0},
	            {0, 0, 0, 4, 1, 9, 0, 0, 5},
	            {0, 0, 0, 0, 8, 0, 0, 7, 9}
	        };

	        if (solveSudoku(board)) {
	            System.out.println("Solved Sudoku:");
	            printBoard(board);
	        } else {
	            System.out.println("No solution exists.");
	        }
	    }


		private static boolean solveSudoku(int[][] board) {
			// TODO Auto-generated method stub
			
			for(int i = 0 ; i < SIZE ; i++)
			{
				for(int  j = 0 ; j < SIZE ; j ++)
				{
					if(board[i][j] == 0)
					{
						for(int k = 1 ; k <= SIZE ; k++)
						{
							
							if(isValid(board , i , j , k))
							{
								board[i][j] = k;
								if(solveSudoku(board))
								{
									return true;
								}
							}
							board[i][j] = 0;
						}
						return false;
					}
				}
			}
			return true;
		}
		

		private static boolean isValid(int[][] board, int row, int col, int num) {
			// TODO Auto-generated method stub
			 for (int i = 0; i < SIZE; i++) {
		            if (board[row][i] == num || board[i][col] == num) return false;
		        }

		        // Check 3x3 subgrid
		        int startRow = row - row % 3;
		        int startCol = col - col % 3;

		        for (int i = startRow; i < startRow + 3; i++) {
		            for (int j = startCol; j < startCol + 3; j++) {
		                if (board[i][j] == num) return false;
		            }
		        }

		        return true;
		}


		private static void printBoard(int[][] board) {
			// TODO Auto-generated method stub
			for(int i = 0 ; i < SIZE ; i++)
			{
				for(int j = 0 ; j < SIZE ; j++)
				{
					System.out.print(board[i][j]+" ");
				}
				System.out.println();
			}
			
		}

}
