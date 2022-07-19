package constructors;
class Std{
	int id;
	String name;

	Std(int i,String n)
	{
	id=i;
	name=n;
	}

	void display() {
	System.out.println(id+" "+name);
	}
}


public class Paramconstructor {
	public static void main(String[] args) {
		Std std1=new Std(7,"mike");
		Std std2=new Std(9,"sai");
		std1.display();
		std2.display();

	}

}
