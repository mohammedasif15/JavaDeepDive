class MyException extends Exception{
   String s1;
   MyException(String s2) {
	s1=s2;
   }
   public String toString(){ 
	return ("Exception has  Occurred: "+s1) ;
   }
}

public class ExceptionHand {
	   public static void main(String args[]){
			try{
				System.out.println("Starting of try block");
			
				throw new MyException("Error has Occured");
			}
			catch(MyException e){
				System.out.println("Catch Block") ;
				
				System.out.println(e) ;
			}
		   }

}
