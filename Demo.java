import java.util.*;
class Demo
{
public static void main(String ab[])
{ Scanner S=new Scanner(System.in);
 int n;
  System.out.println("Enter month num ");
n=S.nextInt();
switch(n)
{
case 2:
case 3:
case 4:
case 5:
  System.out.println("Summer");
break;
case 6:
case 7:
case 8:
case 9:
  System.out.println("Rainy");
break;
case 10:
case 11:
case 12:
case 1:
  System.out.println("Winter");
break;
default:
    System.out.println("Invalid input");
} } }