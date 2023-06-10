package java1;

public class Constructor {
	String Name;
	int Age; 

 Constructor( String Name,int Age)  // constructor declare
 {
	this.Name=Name;
	this.Age=Age;

 } 
	public static void main(String Args[]) {
		Constructor e1 = new Constructor("Swati", 10);
		System.out.println("Constructorn1:"+e1.Name+"  "+e1.Age);   //use for print
		
		
	}
}
