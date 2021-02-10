import java.util.ArrayList;
import java.util.Random;

public class CT2 {
	public static ArrayList<Short> RandomArray(int n, short maxVal, short minVal)
	{
		if(n <= 0)
			return null;
		ArrayList<Short> List = new ArrayList<>(); 
		if(minVal > maxVal)
			return List;
		
		int a = (short)Math.min(minVal, maxVal);
		int b = (short)Math.max(minVal, maxVal);
		
		Random rand = new Random();
		rand.setSeed(System.nanoTime());
		
		int c = (short) (b - a + 1);
		int x = (short)rand.nextInt(c) + a;
		
		for(int i = 0; i < n; i++)
			List.add((short)x);
		
		return List;
		
	}
	public static void main(String [] args)
	{
	
		int a = 5;
		short b = 20;
		short c = 15;
		
		System.out.println(RandomArray(a,b,c));
	}	

}
