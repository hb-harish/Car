
public class Car 
{

	private String color ;
	private String type ; 
	private String year ;
//	private double speed;
	
	public Car()
	{
		System.out.println("Car created");

		
	}
	
	public Car( String col, String typ, String yr)
	{
		color = col ;
		type = typ ;
		year = yr;
//		speed = p;
		
		System.out.println(color + " " +  type + " has been created ");
	}
	public void setColor(String name)
	{
		color = name ;
	}
	public void setType(String name)
	{
		type = name ;
	}
	public void setYear(String name)
	{
		year = name;
	}
	public String setSpeed(double sp)
	{
		return String.format(color + " " + type + " is speeding at " + sp + " mph.");
	}
	public String setStart()
	{
		return String.format(color + " " + type + " has started");
	}
	public String setStop()
	{
		return String.format(color + " " + type + " has stopped");
	}
	public String setAcc()
	{
		return String.format(color + " " + type + " is accelerating");
	}
	public String setDec()
	{
		return String.format(color + " " + type + " is breaking");
	}
	public String setDrift()
	{
		return String.format(color + " " + type + " is drifting");
	}
	
}
