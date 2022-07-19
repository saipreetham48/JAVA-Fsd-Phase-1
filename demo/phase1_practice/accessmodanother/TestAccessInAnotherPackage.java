package accessmodanother;
import accessmodifier.Accessmodifier;

public class TestAccessInAnotherPackage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Accessmodifier obj= new  Accessmodifier();
		
		
		///public method is a globally accessible to all classes and packages
		//obj.methodDefault();
		//obj.methodPrivate();
		//obj.methodProtected();
		obj.methodPublic();
		

	}

}
