package interfaceExamples;

public class InstaImp2 extends InstaImp1 {
	public InstaImp2()
	{
		
	}
	public InstaImp2(String name,String pass)
	{
		super(name,pass);
	}
	public void story(String msg)
	{
		System.out.println(msg);
		System.out.println("Story Updated!");
		
	}

}
