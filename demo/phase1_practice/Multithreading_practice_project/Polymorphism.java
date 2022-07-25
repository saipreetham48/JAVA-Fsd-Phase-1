package multithreading;
class cal
{
	public int add(int a,int b)
	{
		int req=a+b;
		return req;
	}
	public int add(int a,int b,int c)
	{
		int req=a+b+c;
		return req;
	}
	public double add(double a,double b)
	{
		double req=a+b;
		return req;
	}
}
public class Polymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        cal c=new cal();
        System.out.println(c.add(85,96));
        System.out.println(c.add(88,98,200));
        System.out.println(c.add(55.5, 22.3));
	}

}
