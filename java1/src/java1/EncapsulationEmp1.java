package java1;

 class Encap {
	 private  int Empid;
	 
	 public void setEmpid( int empid)
	 {
		 Empid=empid;
	 }
public  int getEmpid()
{
	return Empid;
}
 }
  public class EncapsulationEmp1
 {
	 public static void main(String[] args)
	 {
		 Encap e=new Encap();
		 e.setEmpid(102);
		 System.out.println(e.getEmpid());
	 }
	 
 }
 
