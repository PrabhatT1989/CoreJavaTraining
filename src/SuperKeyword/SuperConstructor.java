package SuperKeyword;

class Animal
{
	Animal()
	{
		System.out.println("Animal Eating");
	}
	Animal(String a)
	{
		System.out.println("Animal Voice");
	}
}

class Tiger extends Animal
{
	
	Tiger()
	{
		
		//super();
		
	//	new Animal("Dog") ;
		
		super("Dog");
		System.out.println("Tiger Eating");
		//super("Dog");
	}
	
	Tiger(String a)
	{
		
	}
}

public class SuperConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Tiger();
		new Tiger("Meat");
		
		
		
	}

}
