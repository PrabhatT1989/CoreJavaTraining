class Base
{
	public void Test3()
	{
		System.out.println("Manual");
	}
}


public class Basic2 {
	
	public void Test() //user define method
	{
		System.out.println("Automation");//implemetion
	}
	
	public void Test1()
	{
		System.out.println("DB Automation");
	}


	
	//Java define method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Testing");
		
		//object creation
		
	//	classname ref = new Constructor(); //constructor name and class name should be same
		//ref.userdefinemethod();
		Basic2 b = new Basic2(); //object creat
		b.Test();
		
		b.Test1();
		
		Base b1 = new Base();
		b1.Test3();
		

	}

}
