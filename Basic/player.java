import java.util.*;
class player
{
 public static void main(String args[])
 {
  int ball,run;
  double strt;
  Scanner S=new Scanner(System.in);
  System.out.println("Enter balls played and run scored");
  ball=S.nextInt();
  run=S.nextInt();
  strt=run/ball*100;
  System.out.println("Strike Rate="+strt);
 }
} 
