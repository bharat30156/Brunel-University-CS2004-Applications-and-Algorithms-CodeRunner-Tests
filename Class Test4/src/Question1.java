import java.util.ArrayList;

public class Question1 {
	public static double OneMaxFitness(ArrayList<Integer> rep){
		
		if(rep == null || rep.size() == 0)
			return -1;	
		for(Integer i : rep)
		{
			if(i != 0 && i != 1 )
				return -2;
		}
		ArrayList<Integer> rep1 = new ArrayList<Integer>(rep);
		int fitness = 0;
		for(Integer i : rep1)
		{
			if(i == 1)
			{
				fitness++;
			}
		}
		return fitness;
	}
	
	public static void main(String[] args)
	{
		ArrayList<Integer> rep = new ArrayList<Integer>();
		rep.add(1);
		rep.add(1);
		rep.add(1);
		rep.add(0);

		System.out.println(OneMaxFitness(rep));
	}

}
