import java.util.Scanner;
 
public class Game
{
	public static void main(String[] args)
    {
		int rows = 8;
        int columns = 8;

        int[][] array = new int[rows][columns];

        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < columns; j++)
            array[i][j] = 0;
        }
            

        for (int i = 0; i < rows; i++) 
        {
            for (int j = 0; j < columns; j++) 
            {
                System.out.printf("[%d] ", array[i][j]);
            }
            System.out.println();
        }

	}
}