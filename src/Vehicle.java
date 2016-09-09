
public class Vehicle 
{
	
	protected String color ;
	protected String type ; 

	
	public Vehicle ()
	{
		System.out.println("Vehicle created");

		
	}
	
	public Vehicle ( String col, String typ)
	{
		color = col ;
		type = typ ;
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


}
