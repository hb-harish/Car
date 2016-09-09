
public class CarApp 
{
	
	public static void main(String[] args) 
	{
		Car a = new Car("Red","Ferrari","2015");
		Car b = new Car("Yellow", "Lamborghini","2016");
		System.out.println(a.setStart());
		System.out.println(b.setStart());
		System.out.println(a.setAcc());
		System.out.println(b.setAcc());
		System.out.println(a.setSpeed(45));
		System.out.println(b.setSpeed(50));
		System.out.println(b.setDec());
		System.out.println(b.setDrift());
		System.out.println(b.setSpeed(40));
		System.out.println(a.setDrift());
		System.out.println(a.setDec());
		System.out.println(a.setSpeed(39));
		System.out.println(a.setAcc());
		System.out.println(b.setAcc());
		System.out.println(a.setSpeed(52));
		System.out.println(b.setSpeed(54));
		System.out.println(b.setDec());
		System.out.println(a.setDec());
		System.out.println(a.setStop());
		System.out.println(b.setStop());
		
		
	}

}
