package simplelearnp1;
import java.util.Scanner;


public class ifelse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter yoyr marks:");
		int a =sc.nextInt();
		if (a>=90)
			System.out.println("outstanding");
		else if (a<=90 && a>35)
			System.out.println("good");
		else
			System.out.println("fail");

	}

}
