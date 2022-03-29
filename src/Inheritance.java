class GP
{
	public void GPFeature()
	{
		System.out.println("calling GP Feature");
	}
}

class Parents extends GP
{
	
	
	
	public void parentFeature()
	{
		System.out.println("calling Parent Feature");
	}
}

class Child extends Parents
{
	
	public void childFeature()
	{
		System.out.println("calling child feature");
	}
}

public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Child c = new Child();
		c.childFeature();
		c.parentFeature();
		c.GPFeature();

	}

}
