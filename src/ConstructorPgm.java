class Cons
{
	Cons(String a)
	{
		System.out.println("calling string");
	}
	Cons(int a , String b)
	{
		System.out.println("calling int and string");
	}
	
	Cons(double b)
	{
		System.out.println("calling double");
	}
	
	
}
public class ConstructorPgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//int a = 20;
		
		new Cons(10,"test");
		new Cons("Test");
		new Cons(20.5);
		

	}

}
