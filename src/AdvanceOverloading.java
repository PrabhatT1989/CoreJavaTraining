class Aol
{
//	public void Test(int a , long b)
//	{
//		System.out.println("calling int and long");
//	}
//	public void Test(long a , int b)
//	{
//		System.out.println("calling long and int");
//	}
	
	
	Floating-point a;
//	
	public void Test(int a , String b)
	{
		System.out.println("calling int and double");
	}
//	public void Test(char a , int b)
//	{
//		System.out.println("calling char and int");
//	}
	
	public void Test(int a , double b)
	{
		System.out.println("calling int and double");
	}
//	public void Test(short a , byte b)
//	{
//		System.out.println("calling short and byte");
//	}
}
public class AdvanceOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Aol a = new Aol();
		//a.Test(10l, 20);
		//a.Test(10, 10.5f);
	//	a.Test((short)10, (byte)20); //type casting
		
	//	a.Test(true, 'a');
		
		a.Test('a', 10);

	}

}
