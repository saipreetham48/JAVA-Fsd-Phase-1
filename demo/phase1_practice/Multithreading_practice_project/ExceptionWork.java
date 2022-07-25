package multithreading;
class Excep extends Exception
{
	public Excep(String s)
	{
		super(s);
	}
}
public class ExceptionWork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        try
        {
        	throw new Excep("you");
        }
        catch(Excep e)
        {
        	System.out.println("Caught");
        	System.out.println(e.getMessage());
        }
	}

}
