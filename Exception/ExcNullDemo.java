class ExcNullDemo
{
 public static void main(String args[])
 {
  try
  {
    String S=null;
    System.out.println(S.length());
  }
  catch(NullPointerException e)
  {
   System.out.println("null pointer Exception");
  }
  
  System.out.println("rest of the code");
 }
} 
    