package AbstractionConcept;

abstract class Abs
{
	public void Test() //non abstract method
	{
		System.out.println("calling test");
	}
	
	abstract public void Test1(); //unimplemented Method
	
}

class Abs1 extends Abs
{

	@Override
	public void Test1() {
		// TODO Auto-generated method stub
		System.out.println("Calling Test1 ");
	}
	
}

public class AbstractCon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Abs1 a  = new Abs1();
		a.Test();
		a.Test1();
		
		

	}

}
