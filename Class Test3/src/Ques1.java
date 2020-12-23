import java.util.ArrayList;
import java.util.Random;

public class Ques1 {
	
	public static double ScalesFitness(ArrayList<Boolean> rep, ArrayList<Double> weights)
	{
		if(rep == null || weights == null)
			return -100;
		if(rep.size() == 0 || weights.size() == 0)
			return - 100;
		if(rep.size() > weights.size())
			return -100;
		
		double lhs = 0.0;
		double rhs = 0.0;
	
		for(int i = 0; i < rep.size(); i++)
		{
			if(rep.set(i, true))
			{
				lhs += weights.get(i);
			}
			else
			{
				rep.set(i, false);
				rhs += weights.get(i);
			}
		}
		return Math.abs(lhs - rhs);
	}
	
	public static void main(String[] args )
	{
		 ArrayList<Double> weights = new ArrayList<Double>();
		 weights.add(1.0);
		 weights.add(2.0);
		 weights.add(3.0);
		 weights.add(4.0);
		 weights.add(10.0);
		 System.out.println(weights);
		 ArrayList<Boolean> rep = new ArrayList<>();
		 rep.add(true);
		 rep.add(true);
		 rep.add(true);
		 rep.add(true);
		 rep.add(true);

		 
		 System.out.println(ScalesFitness(rep,weights));
	}
}
