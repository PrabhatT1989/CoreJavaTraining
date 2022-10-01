package SuperKeyword;

class CS1
{
	public void getColor()
	{
		System.out.println("Red");
	}
	
	public void AirBag()
	{
		System.out.println("Available in Automatic variant");
	}
	
	public void Engine()
	{
		System.out.println("1500cc");
	}
}

class CS2 extends CS1
{
	public void getColor()
	{
		System.out.println("Blue");
	}
	
	public void AirBag()
	{
		System.out.println("Available in Top Model and Automatic variant");
	}
	
	public void Engine()
	{
		System.out.println("1300cc");
	}
	
	public void getDetails()
	{
		getColor();
		AirBag();
		super.Engine();
	}
}

public class SuperMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CS2 c = new CS2();
		c.getDetails();

	}

}
