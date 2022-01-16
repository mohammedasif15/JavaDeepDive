class Meth2{
	int Mul(int a,int b) {
		int z=a*b;
		return z;
	}
	double Mul(double a) {
		int b=5;
		double z=a*b;
		return z;
		
	}
}
public class Methods2 {
	public static void main(String[] args) {
		Meth2 m= new Meth2(); 
		System.out.println("Multiplication res "+m.Mul(5,2));
		System.out.println("Multiplication res "+m.Mul(22.5));
	}

}
