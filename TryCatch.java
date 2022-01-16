import java.util.Scanner;

public class TryCatch {
	
	    public static void main(String args[]) 
	    {
	        System.out.println("Enter An Integer ");
	        Scanner s=new Scanner(System.in);
	try {
	        int c=s.nextInt();
	}catch(Exception E) {
		System.out.println(E+" Enter an ineger");
	}
	
	
	}
	}


