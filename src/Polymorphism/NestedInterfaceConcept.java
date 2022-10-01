package Polymorphism;
class ABC
{
	
	public void Test()
	{
		
	}
	class BCD
	{
		public void Test1()
		{
			
		}
	}
}

class CDE
{
	
	public void Test3()
	{
		System.out.println("calling Test 3");
	}
	interface DEF
	{
		public void Test4();
	}
}


class JKL extends CDE implements CDE.DEF
{

	@Override
	public void Test4() {
		// TODO Auto-generated method stub
		System.out.println("calling Test 4");
	}
	
}

interface EFG
{
	
	public void Test5();
	
	class FGH
	{
		
		public void Test6()
		{
			System.out.println("calling Test 6");
		}
	}
	
}



interface GHI
{
	public void Test7();
	
	interface HIJ
	{
		public void Test8();
	}
}

public class NestedInterfaceConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JKL j = new JKL();
		j.Test4();
		j.Test3();

	}

}
