import java.util.Scanner;

public class ThrowClass {
	 public static void main(String[] args)
     {

       Scanner s=new Scanner(System.in);
       System.out.println("Enter a");
       
       int a=s.nextInt();
       System.out.println("enter b");
       int b=s.nextInt();
       int c;

         try
         {
             if(b==0)        
                 throw(new ArithmeticException("Can't divide by zero."));
             else
             {
                 c= a / b;
                 System.out.println("The result is : " + c);
             }
         }
         catch(ArithmeticException e)
         {
             System.out.print("\n\tError : " + e.getMessage());
         }

     }


}
