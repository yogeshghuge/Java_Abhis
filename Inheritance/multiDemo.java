class First
{
 void abc()
 {
  System.out.println("I am in First");
 }
}
class Second extends First
{
 void mno()
 {
  System.out.println("I am in Second");
 }
}
class Third extends Second
{
 void xyz()
 {
  System.out.println("I am in third");
 }
}
class multiDemo
{
 public static void main(String args[])
 {
  Third T=new Third();
  T.abc();
  T.mno();
  T.xyz();
 }
} 