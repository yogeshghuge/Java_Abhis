class MultipleExc
{
 public static void main(String args[])
 {
  int a[5]={5,8,6,4,1};
  int x=10,y;
  try
  {
    y=x/0;
    System.out.println(a[10]);
    System.out.println(y);
  }
  catch(ArrayIndexOutOfBoundsException e)
  {
   System.out.println("Array out of range");
  }
  catch(ArithmeticException e)
  {
   System.out.println("Divide by 0");
  }
  System.out.println("rest of the code");
 }
} 
    