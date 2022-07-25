package multithreading;

public class RunnableThread implements Runnable{
	public static int num = 0;
    public RunnableThread(){
         
    }
    public void run() {
        while(RunnableThread.num <= 10){
            try{
                System.out.println("Thread: "+(++RunnableThread.num));
                Thread.sleep(100);
            } catch (InterruptedException iex) {
                System.out.println("Exception in thread: "+iex.getMessage());
            }
        }
    } 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("Starting Main Thread...");
	        RunnableThread mrt = new RunnableThread();
	        Thread req = new Thread(mrt);
	        req.start();
	        while(RunnableThread.num <= 10){
	            try{
	                System.out.println("Main Thread: "+(++RunnableThread.num));
	                Thread.sleep(100);
	            } catch (InterruptedException iex){
	                System.out.println("Exception in main thread: "+iex.getMessage());
	            }
	        }
	        System.out.println("End of Main Thread...");
	    }
	}


