class Demofinalize
{
 int a=10;
 Demofinalize
 {
   System.out.println("A="+a);
protected void finalize()
 {
   
   System.out.println("finalize called");
 }
 public static void main(String args[])
 {
  Demofinalize D=new Demofinalize();
  }
}

  
 