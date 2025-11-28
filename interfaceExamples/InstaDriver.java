package interfaceExamples;

public class InstaDriver {
	public static void main(String[] args) {
		Instagram i1=new  InstaImp2("Sanika","Sanu2710");
		Instagram.message("Sanika");
		i1.post("I am Sanika Patil !!! Today i get my first Job!!!");
		i1.comment("Aai", "Congratualation Bala!!");
		i1.like("Samruddhi Sawant");
		i1.message("Sanika ", "Who are you");
		i1.story("I happy Alone ");
		
		
		
		
	}

}
