package construction;

public class cost {
	public int calc(String material_standard,double area,String s)
	{
		if(material_standard.equals("high standard materials")&&s.contentEquals("fully automated home"))
		{
			return (int) (2500*area);
		}
		else if(material_standard.equals("standard materials"))
		{
			return (int) (area*1200);
		}
		else if(material_standard.equals("above standard materials"))
		{
			return (int) (1500*area);
		}
		else if(material_standard.contentEquals("high standard materials"))
		{
			return (int) (2800*area);
		}
		return 0;
	}

}
