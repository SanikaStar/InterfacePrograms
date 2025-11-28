package interfaceExamples;

public interface Instagram {
	void post(String ip);
	void like(String name);
	void comment(String name,String ip);
	void message(String name,String msg);
	void story(String msg);
	static void message(String name)
	{
		System.out.println("Heyyy!!!"+name+" Welcome to instagram...");
	}
	

}
