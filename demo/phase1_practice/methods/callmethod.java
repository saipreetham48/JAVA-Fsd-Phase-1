package methods;

public class callmethod {
	int a=5;

	int operation(int a) {
		a =a*10/100;
		return(a);
	}

	public static void main(String args[]) {
		callmethod d = new callmethod();
		System.out.println("Before operation value of data is "+d.a);
		d.operation(100);
		System.out.println("After operation value of data is "+d.a);
		}
	}




