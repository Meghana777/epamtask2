package interest;

public class CompoundInterest {
	public double calc(int p,double rate,double time)
	{
		return p*(Math.pow((1+rate)/100,time));
		
	}

}

