class Std{
	int id;
	String name;
	Std(int id , String name){
		this.id=id;
		this.name=name;
		System.out.println("Student name is "+name+" "+"Student id is "+id);
	}

}
public class Constructor2 {
public static void main(String[] args) {
	Std s1=new Std(11 , "Anup");
	
}
}
