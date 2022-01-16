public class MyThread extends Thread
{
 	public void run()
 	{
  		System.out.println("Running the new thread");
}
 	public static void main( String args[] ) throws InterruptedException
 	{
  		MyThread t1 = new  MyThread();
  		
  		t1.start();
 	
 	}
 	
}

