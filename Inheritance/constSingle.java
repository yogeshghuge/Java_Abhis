class First
{
 First()
 {
  System.out.println("I am in First");
 }
}
class Second extends First
{
 Second()
 {
  System.out.println("I am in Second");
 }
}
class constSingle
{
 public static void main(String args[])
 {
  Second S=new Second();
 }
} 
   
 
   