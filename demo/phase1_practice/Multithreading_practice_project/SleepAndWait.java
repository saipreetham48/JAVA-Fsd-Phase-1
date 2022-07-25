package multithreading;

public class SleepAndWait {
    private static Object req=new Object();
	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
        Thread.sleep(500);
        System.out.println("Thread: "+Thread.currentThread().getName()+" is woken after sleeping for 0.5 second");
        synchronized(req)
        {
           req.wait(500);
           System.out.println("Object"+req+" is woken after waiting for 0.5 second");
        }
        
	}

}
