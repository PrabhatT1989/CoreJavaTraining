package Polymorphism;

abstract class Animal
{
	abstract public void Voice();
	
}

class Tiger extends Animal
{

	@Override
	public void Voice() {
		// TODO Auto-generated method stub
		System.out.println("Roaring");
	}
	
}

class Dog extends Animal
{
	public void Voice()
	{
		System.out.println("barking");
	}
}

class Cat extends Animal
{
	public void Voice()
	{
		System.out.println("Meow");
	}
}

public class RunTimePolymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal a = new Dog(); //upcasting --- RTP
		a.Voice();
		
		//WebDriver driver = new ChromeDriver();
				

	}

}
