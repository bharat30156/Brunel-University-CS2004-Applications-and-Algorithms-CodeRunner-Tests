import java.util.ArrayList;

public class CT1 {
	public static ArrayList<Float> PrefixAverage(ArrayList<Float> X)
	{
		if(X == null || X.size() == 0)
			return null;
		ArrayList <Float> X1 = new ArrayList <Float>(X);
		float s = 0;
		for(int i = 0; i <= X1.size() - 1; i++)
		{
			s = s + X1.get(i);
			X1.set(i, s / (i +1));	
		}
		return X1;
	}
	
	public static void main(String [] args)
	{
		ArrayList <Float> X = new ArrayList <Float>();
		X.add((float) 7);
		X.add((float) 3);
		X.add((float) -1);
		X.add((float) 2);
		X.add((float) 9);
		X.add((float) 0);
		X.add((float) 0.8);
		X.add((float) 52);
		X.add((float) 2.2);
		X.add((float) 900);
		
		
		System.out.println(PrefixAverage(X));
	}


}
