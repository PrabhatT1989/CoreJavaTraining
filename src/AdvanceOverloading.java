class Aol
{
	public void Test(int a , String b)
	{
		System.out.println("calling int and long");
	}
	public void Test(long a , int b)
	{
		System.out.println("calling long and int");
	}
}
public class AdvanceOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Aol a = new Aol();
		a.Test(10, 20);

	}

}
