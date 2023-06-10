package java1;

 class Encapsul {
	 private  int Empid;
	 
	 public void setEmpid( int empid)
	 {
		 Empid=empid;
	 }
public  int getEmpid()
{
	return Empid;
}
  public class EncapsulationEmp
 {
	 public static void main(String[] args)
	 {
		 Encapsul e=new Encapsul();
		 e.setEmpid(102);
		 System.out.println(e.getEmpid());
	 }
	 
 }
}
