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
class Third extends Second
{
 Third()
 {
  System.out.println("I am in third");
 }
}
class constmultilevel
{
 public static void main(String args[])
 {
  Third T=new Third();
 }
} 