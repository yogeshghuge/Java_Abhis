class ExcDemo
{
 public static void main(String args[])
 {
  try
  {
    int a=25/0;
    System.out.println(a);
  }
  catch(Exception e)
  {
   System.out.println(e);
  }
  System.out.println("rest of the code");
 }
} 
    