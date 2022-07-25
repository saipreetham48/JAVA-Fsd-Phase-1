package multithreading;
import java.util.*;
import java.io.*;
class work
{
	public void display(String w)
	{
		System.out.println("output\t"+w);
		try
		{
			Thread.sleep(500);
		}
		catch(Exception e)
		{
			System.out.println("Interrupted");
		}
		System.out.println("\n"+w+"sent");
	}
}
class Send extends Thread
{
	private String yours;
	private Thread t;
	work sent;
	Send(String m,work obj)
	{
		yours=m;
		sent=obj;
	}
	public void run()
	{
		synchronized(sent)
		{
			sent.display(yours);
		}
	}
}

public class Synchronization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        work w=new work();
        Send t1=new Send("hello",w);
        Send t2=new Send("GoodBye",w);
        t1.start();
        t2.start();
        try {
        	t1.join();
        	t2.join();
        }
        catch(Exception e)
        {
        	System.out.println("Problem Occured");
        }
	}

}
