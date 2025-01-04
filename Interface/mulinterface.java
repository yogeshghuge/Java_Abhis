interface First
{
 int a=7;
 void show();
}
class Second implements First
{
 public void show()
 {
   System.out.println(" I am in show");
 }
}
class mulinterface extends Second
{
 public void show()
 {
  System.out.println(" Square="+(a*a));
 }
 public static void show(String args[])
 {
  mulinterface M=new mulinterface();
  M.show();
 }
}  