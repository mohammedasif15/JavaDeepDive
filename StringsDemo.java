
public class StringsDemo {
	public static void main(String[] args) {
		
	
	System.out.println("Welcome to String Operations");
	
	String sl=new String("Welcome to JAVA");
	System.out.println(sl.length());
	String sub=new String("Welcome");
	System.out.println(sub.substring(2));
	
	String s1="New";
	String s2="Old";
	System.out.println(s1.compareTo(s2));

	String s4="";
	System.out.println(s4.isEmpty());

	
	String s5="ABCD";
	System.out.println(s1.toLowerCase());
	

	String s6="NewModel";
	String replace=s2.replace('d', 'l');
	System.out.println(replace);

	
	String x="Hi How Are u";
	String y="HI how Are you";
	System.out.println(x.equals(y));

	System.out.println("Creating StringBuffer");
	
	StringBuffer s=new StringBuffer("What is the matter");
	s.append("Welcome to New World");
	System.out.println(s);

	s.insert(0, 'w');
	System.out.println(s);


	StringBuffer sb=new StringBuffer("Hello");
	sb.replace(0, 2, "hEl");
	System.out.println(sb);

	sb.delete(0, 1);
	System.out.println(sb);
	

}
}