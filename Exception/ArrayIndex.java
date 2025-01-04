class ArrayIndex
{
 public static void main(String args[])
 {
  int a[5]={5,6,8,9,7};
  
  try
  {
    System.out.println(a[4]);
    System.out.println(a[10]);
    System.out.println(a[2]);
  }
  catch(ArrayIndexOutOfBoundsException e)
  {
   System.out.println("Array out of range");
  }
}