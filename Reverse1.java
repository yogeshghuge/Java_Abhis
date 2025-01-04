public class Reverse1
{
    public static void main(String[] args) 
    {
        int i,rev=0,n=10899;
        for(i=1;i<=n; i++)
        {
           i=n%10;
           rev=rev*10+i;
           n=n/10; 

        }
        System.out.println(rev);
        
        
    }
}
