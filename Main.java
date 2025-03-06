import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    int [] [] mat = productTable(5, 5);

    for (int [] row : mat)
    {
      for (int elem : row)
      {
        
      }
    }
      }


  public static int sumOfDiag(int[][] matrix)
  {
    int sum = 0;
    for (int row = 0; row < matrix.length; row++)
    {
      for (int col = 0; col < matrix[row].length; col++)
      {
        if (row == col) //main diagonal
        {
          sum+= mat[row][col];
        }
      }
    }

    return sum;
  }

  public static int[][] productTable(final int numRows, final int numCols)
  {
    int [] [] mat = new int[numRows][numCols];

    for (int r = 0; r < numRows; r++)
    {
      for (int c = 0; c < numCols; numColsc++)
      {
        r * c;
      }
    return sum;
  }
}
