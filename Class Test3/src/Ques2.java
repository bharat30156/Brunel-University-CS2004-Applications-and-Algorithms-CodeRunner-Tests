
import java.util.Random;

public class Ques2 {
	public static String RandomBinaryString(int n)
	{
		if(n <= 0)
			return "";
		String randomBinary = "";
		Random rand = new Random();
		boolean res;
		
		for(int i = 0; i <= n - 1; i++)
		{
			res = rand.nextBoolean();
			if(res)
				randomBinary = randomBinary.concat("1");
			else
				randomBinary = randomBinary.concat("0");
		}
		
		
		return randomBinary;
		
	}
	public static void main(String[] args )
	{
		System.out.println(RandomBinaryString(8));
	}

}
