package interfaceExamples;

public class ShapeDriver {
	public static void main(String[] args) {
		Shape s1=new ShapeImp();
		s1.areaOfCircle(5);
		s1.areaOfSquare(10);
		s1.perimeterOfSquare(15);
	}

}
