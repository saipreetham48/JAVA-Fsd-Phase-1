package simplelearnp1;

import java.util.Scanner;

public class arithmeticcalculator {
	
  public int add(int a ,int b)
  {
   return a + b;
  }
  
  public int sub(int a,int b)
  {
   return a - b;
  }
 
  public int mul(int a, int b)
  {
   return a * b;
  }
  
  public float div(float a,float b)
  {
   return a / b;
  }

 public static void main(String[] args) {
  
  arithmeticcalculator ac = new arithmeticcalculator();
  int a,b,choice;
  @SuppressWarnings("resource")
Scanner sc = new Scanner(System.in);
  System.out.println("Enter Value of A : ");
  a=sc.nextInt();
  System.out.println("Enter Value of B : ");
  b=sc.nextInt();
  
  
  char ch ;
  do {
   System.out.println("*Arithmetic Calculator*");
   System.out.println("1. Addition");
   System.out.println("2. Substraction");
   System.out.println("3. Multiplication");
   System.out.println("4. Division");
   System.out.println("Please select one of the above no to perform Arithmetic Calculation : ");
   choice=sc.nextInt();
   
  switch(choice)
  {
  case 1: {
   System.out.println("Addition of A and B : "+ac.add(a,b));
   break;
    }
  case 2 :{
   System.out.println("Subtraction of A and B : "+ac.sub(a, b));
   break;
   }
  case 3 :{
   System.out.println("Multiplication of A and B : "+ac.mul(a, b));
   break;
   }
  case 4 :{
   System.out.println("Division of A and B : "+ac.div(a, b));
   break;
   }
  default :
  {
   System.out.println("Invalid Choice");
   break;
  }
  }
  
   System.out.println("\nDo you want to continue (Type y or n) \n");
         ch = sc.next().charAt(0);
  }while (ch == 'Y'|| ch == 'y'); 
 }

}

