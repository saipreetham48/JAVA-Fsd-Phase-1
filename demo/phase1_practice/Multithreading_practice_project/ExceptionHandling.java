package multithreading;
class Ex extends Exception
{
	String a;
	Ex(String b)
	{
		a=b;
	}
	public String Met()
	{
		return ("Exception: "+a);
	}
}
public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        try
        {
        	throw new Ex("error");
        }
        catch(Ex e)
        {
        	System.out.println("Catch");
        	System.out.println(e);
        }
	}

}
