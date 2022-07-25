package multithreading;
interface one
{
	default void out()
	{
		System.out.println("First");
	}
}
interface two
{
	default void out()
	{
	    System.out.println("Second");
}}
public class Diamond implements one,two {

	public void out()
    {
    	one.super.out();
    	two.super.out();
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Diamond d=new Diamond();
        d.out();
	}

}
