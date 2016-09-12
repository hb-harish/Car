
public class Car extends Vehicle
{


//	private double speed;
	private Driver1 a;
	private Driver2 b;
	
	public Car()
	{
		System.out.println("Car created");

		
	}
	
	public Car( String col, String typ)
	{
		this.color = col ;
		this.type = typ ;

//		speed = p;
		
		System.out.println(color + " " +  type + " has been created ");
	}
//	public void setColor(String name)
//	{
//		color = name ;
//	}
//	public void setType(String name)
//	{
//		type = name ;
//	}
//	public void setYear(String name)
//	{
//		year = name;
//	}
	public String setSpeed(double sp)
	{
		return String.format(color + " " + type + " is speeding at " + sp + " mph.");
	}
//	public String setStart()
//	{
//		return String.format(color + " " + type + " has started");
//	}
//	public String setStop()
//	{
//		return String.format(color + " " + type + " has stopped");
//	}
//	public String setAcc()
//	{
//		return String.format(color + " " + type + " is accelerating");
//	}
//	public String setDec()
//	{
//		return String.format(color + " " + type + " is breaking");
//	}
	public String setDrift()
	{
		return String.format(color + " " + type + " is drifting");
	}
//	public String getyear()
//	{
//		return String.format(year);
//	}
	public String getName1()
	{
		a = new Driver1();
		return String.format(color + " " + type + " is drven by " + a.getName());
	}
	public String getName2()
	{
		b = new Driver2();
		return String.format(color + " " + type + " is drven by " + b.getName());
	}
	
}
