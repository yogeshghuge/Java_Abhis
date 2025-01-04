class Demofi
{
 int a=10;
 Demofi
 {
   System.out.println("A="+a);
protected void finalize()
 {
   
   System.out.println("finalize called");
 }
 public static void main(String args[])
 {
  Demofi D=new Demofi();
  }
}

  
 