class First
{
  void area(int s)
  {
   System.out.println("Area of square="+(s*s));
  }
  void area(int l,int b)
  {
   System.out.println("Area of Rectangle="+(l*b));
  }
  void area(float pie,float r)
 {
  System.out.println("Area of cricle="+(pie*r*r)); 
 }
}
class Funoverload
{
 public static void main(String args[])
 {
  First F=new First();
  F.area(34);
  F.area(5,6);
  F.area(3.14f,34f);
 }
}