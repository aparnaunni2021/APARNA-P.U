
public class sudoku
{
	public static boolean isValid(int[][] puzzle,int row, int col,int number)
	{
		for (int d = 0; d < puzzle.length; d++)
		{
			if (puzzle[row][d] == number) {
				return false;
			}
		}
		for (int r = 0; r < puzzle.length; r++)
		{
			if (puzzle[r][col] == number)
			{
				return false;
			}
		}
		int sqrt = (int)Math.sqrt(puzzle.length);
		int bRow = row - row % sqrt;
		int bCol = col - col % sqrt;
		for (int r = bRow;
			r < bRow + sqrt; r++)
		{
			for (int d = bCol;
				d < bCol + sqrt; d++)
			{
				if (puzzle[r][d] == number)
				{
					return false;
				}
			}
		}
		return true;
	}
	public static boolean solution(int[][] puzzle, int n)
	{
		int row = -1;
		int col = -1;
		boolean isEmpty = true;
		for (int i = 0; i < n; i++)
		{
			for (int j = 0; j < n; j++)
			{
				if (puzzle[i][j] == 0)
				{
					row = i;
					col = j;
					isEmpty = false;
					break;
				}
			}
			if (!isEmpty) {
				break;
			}
		}
		if (isEmpty)
		{
			return true;
		}
		for (int number = 1; number <= n; number++)
		{
			if (isValid(puzzle, row, col, number))
			{
				puzzle[row][col] = number;
				if (solution(puzzle, n))
				{
					return true;
				}
				else
				{
					puzzle[row][col] = 0;
				}
			}
		}
		return false;
	}
	public static void printSudoku(int[][] puzzle, int N)
	{
		for (int r = 0; r < N; r++)
		{
			for (int d = 0; d < N; d++)
			{
				System.out.print(puzzle[r][d]);
				System.out.print(" ");
			}
			System.out.print("\n");

			if ((r + 1) % (int)Math.sqrt(N) == 0)
			{
				System.out.print("");
			}
		}
	}

	public static void main(String args[])
	{
		int[][] puzzle = new int[][] {
			{ 1, 0, 3, },
			{ 4, 0, 6,  },
			{ 7, 8, 0,  },
		};
		int N = puzzle.length;
        System.out.println("Before Solving");
        printSudoku(puzzle, N);
        System.out.println("");
        System.out.println("After Solving");
		if (solution(puzzle, N))
		{
			printSudoku(puzzle, N);
		}
		else 
		{
			System.out.println("No solution exists");
		}
	}
}