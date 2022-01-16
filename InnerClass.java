
public class InnerClass {
      String s="Hi"; 
	 
	 class InnerClass1{  
	  void display(){System.out.println(s+", Welcome to Java");}  
	 }  


	public static void main(String[] args) {

		InnerClass obj=new InnerClass();
		InnerClass.InnerClass1 in=obj.new InnerClass1();  
		in.display();  
	}
}



