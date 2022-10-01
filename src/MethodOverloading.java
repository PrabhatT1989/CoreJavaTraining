class Mol
{
	public void Test(int a,String b)
	{
		System.out.println("Calling int");
	}
	
	public void Test()
	{
		System.out.println("calling String");
	}
}
public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Mol m = new Mol();
		m.Test(10,"test");

	}

}
