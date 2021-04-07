public class Myfun
{ 
  public static void main(String []args)
  {
   Students s1 = new Students();
   s1.setAge(20);
   s1.setName("Ruby");
   s1.setRollno(100);
	
   System.out.println("Rollno= "+s1.getRollno()+" Name= "+s1.getName()+" Age= "+s1.getAge());   
   }

}