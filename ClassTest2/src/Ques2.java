import java.util.Arrays;
import java.util.Random;

public class Ques2 {
	public static int[][] RandomMatrix(int n, int lower, int upper)
	{
		if(n <= 0)
			return null;
		if(lower > upper)
			return null;
		int[][] Matrix = new int[n][n];
		
		int a = Math.min(lower, upper);
		int b = Math.max(lower, upper);
		
		Random rand = new Random();
		rand.setSeed(System.nanoTime());
		
		int c = b - a + 1;
		int x = rand.nextInt(c) + a;
		
		for(int i = 0; i < n; i++)
		{
			for(int j = 0; j < n; j++)
			{
				Matrix[i][j] = x;
				if(i == j || (i + j) == (n - 1))
				{
					Matrix[i][j] = Math.min(lower, lower);
				}
			}
		}
		return Matrix;
	}
	
	public static void main(String[] args)
	{
		System.out.println(Arrays.deepToString(RandomMatrix(3,19,30)));
	}

}
