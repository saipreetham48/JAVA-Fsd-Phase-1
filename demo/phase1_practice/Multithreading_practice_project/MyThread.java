package multithreading;

public class MyThread extends Thread {
    public void run() {
    	System.out.println("Executing multithreading using Thread class");
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        MyThread s=new MyThread();
        s.start();
	}

}
