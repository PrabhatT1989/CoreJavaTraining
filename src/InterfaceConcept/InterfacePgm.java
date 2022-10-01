package InterfaceConcept;

interface Image
{
	 public void Tringle(); //abstract method
	
}
interface Square extends Image
{
	public void SquareShape();
}

interface Pentagon extends Square
{
	public void Penta();
}

interface Hexa 
{
	public void Hexagon();
}

interface Septa extends Pentagon,Hexa
{
	public void Septagon();
}

class Multimedia implements Septa
{

	@Override
	public void Tringle() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void SquareShape() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Penta() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Hexagon() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Septagon() {
		// TODO Auto-generated method stub
		
	}
	
}

class Multi implements Hexa
{

	@Override
	public void Hexagon() {
		// TODO Auto-generated method stub
		
	}
	
}

public class InterfacePgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
