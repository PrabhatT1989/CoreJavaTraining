package statickeyword;

class Image
{
	 static String shape ="Tringle";
	 public static void getShape()
	 {
		 System.out.println("Square");
	 }
}

public class staticConcept {
	
	static String color = "Blue";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Image  i = new Image();
	//	System.out.println(i.shape);
		
		//System.out.println(Image.shape);
		System.out.println(staticConcept.color);
		
		Image.getShape();
		i.getShape();

	}

}
