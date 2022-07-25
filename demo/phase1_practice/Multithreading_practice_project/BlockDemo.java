package multithreading;

public class BlockDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int num1=80,num2=0,ans=0;
        try {
        	ans=num1/num2;
        }
        catch(ArithmeticException e)
        {
        	System.out.println("Error: "+e.getMessage());
        }
        finally
        {
        	System.out.println("The result is : "+ans);
        }
	}

}
