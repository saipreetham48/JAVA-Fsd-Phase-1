package multithreading;

public class ThrowException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int num1=100,num2=0,ans;
        try
        {
        	if(num2==0)
        		throw(new ArithmeticException("Dividing with 0 is not possible"));
        	else
        	{
        		ans=num1/num2;
        		System.out.println("The answer is: "+ans);
        	}
        }
        catch(ArithmeticException a)
        {
        	System.out.println("Error: "+a.getMessage());
        }
        
	}

}
