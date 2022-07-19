package innerclass;

public class Innerclass1 {

	 private String msg="Hello"; 
	 
	 class Inner{  
	  void hello(){System.out.println(msg+", welcome to this world");}  
	 }  


	public static void main(String[] args) {

		Innerclass1 obj=new Innerclass1();
		Innerclass1.Inner in=obj.new Inner();  
		in.hello();  
	}
}




