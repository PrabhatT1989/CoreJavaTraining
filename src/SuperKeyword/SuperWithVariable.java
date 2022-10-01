package SuperKeyword;

class Carshowroom1
{
	String Color= "Blue";
}

class CarShowroom2 extends Carshowroom1	
{
	String Color="Yellow";
	
	public void Broucher()
	{
		System.out.println(super.Color+""+this.Color);
	}
	
}


public class SuperWithVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CarShowroom2 c = new CarShowroom2();
		c.Broucher();

	}

}
