class KFCAmerica
{
 final	public void Product()
	{
		System.out.println("KFC");
	}
	
	public void Location()
	{
		System.out.println("california");
	}
}

class KFCIndia extends KFCAmerica
{
	/*
	 * public void IndiaPizza() { System.out.println("Pizza"); }
	 */
	
	public void Location()
	{
		System.out.println("Delhi");
	}
}

class KFCUK extends KFCAmerica
{
	
	public void Location()
	{
		System.out.println("London");
	}
	
}

public class RealTimeMethodOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		KFCAmerica k = new KFCIndia();
		k.Location();
		k.Product();
		//k.IndiaPizza();

	}

}
