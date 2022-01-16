class Start_Prj implements Runnable{

	@Override
	public void run() {
		System.out.println("u are in runnable Interface");
		
	}
	
}
public class NewThread {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("U are in main methode");
		Start_Prj sp=new Start_Prj();
		Thread t=new Thread(sp);
		for(int i=0;i<=10;i++) {
			System.out.println(i);
			t.sleep(2000);
			
		}
		sp.run();
	}
	

}
