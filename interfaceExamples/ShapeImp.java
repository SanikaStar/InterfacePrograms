package interfaceExamples;

public class ShapeImp implements Shape{
	
	public  void areaOfSquare(int sides)
	{
		int area=sides*sides;
		System.out.println(area);
	}

	
	public  void perimeterOfSquare(int side)
	{
		int area=4*side;
		System.out.println(area);
	}
	public void areaOfCircle(int rad)
	{
		int area=(int) (pi*rad*rad);
		System.out.println(area);
	}
	 


}
