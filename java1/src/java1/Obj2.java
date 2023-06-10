// Intilize object
package java1;

/*public class Obj2 
{
	String color;
	int age;

	void ObjInti (String s,int a)
	{// Creating Method
	color=s;
	age=a;
	}

	void Display() 
	{
		System.out.println(color + "  " + age);
	}

	public static void main(String Args[])
	{
		Obj2 Buzo = new Obj2();
		Buzo.ObjInti("Black", 10);
		Buzo.Display();
	}

}*/


//By using Refrence Variables


public class Obj2
{
	String color;
	int age;
	
	public static void main(String Args[])
	
	{
		Obj2 Buzo=new Obj2();
		Buzo.color="Black";
		Buzo.age=20;
		
		System.out.println(Buzo.color+" "+Buzo.age); 
		
	}
	
	
	
}
   
