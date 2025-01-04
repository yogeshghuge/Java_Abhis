class ExcAriDemo
{
 public static void main(String args[])
 {
  try
  {
    int a=25/0;
    System.out.println(a);
  }
  catch(ArithmeticException e)
  {
   System.out.println(e);
  }
  catch(Exception e)
  {
   System.out.println(e);
  }
  System.out.println("rest of the code");
 }
} 
    