package multithreading;

public class Exceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int arr[]=new int[3];
        try
        {
        	arr[4]=6;
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
        	System.out.println("Range out of bound");
        }
        finally
        {
        	System.out.println("The actual size of array is: "+arr.length);
        }
	}

}
