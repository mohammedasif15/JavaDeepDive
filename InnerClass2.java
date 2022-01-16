
public class InnerClass2 {

private String s="HII Welcome";

 void show(){  
	 class Inner{  
		 void dis(){
			 System.out.println(s);
		 }  
  }  
  
  Inner in=new Inner();  
  in.dis();  
 }  

 
public static void main(String[] args) {
	InnerClass2  inn=new InnerClass2 ();  
	inn.show();  
	}
}


