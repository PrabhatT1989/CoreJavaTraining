class Mor
{
	public void Test()
	{
		System.out.println("Calling Test Method in MOR class");
	}
}

class Mor1 extends Mor
{
	
	
	public void Test()
	{
		System.out.println("Calling Test Method in MOR1 class");
	}
}
public class MethodOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Mor1 m = new Mor1();
		m.Test();
		//m.Test1();

	}

}
