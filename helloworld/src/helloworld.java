import java.util.Scanner;

public class helloworld {
//public static void main(String args[])
//{
   // System.out.println("Hello World");
//}
   public static void main (String[] args)
    {
        int n;
        int flag=0,l=0,m=0,u;
        u=19;
        int[] a = new int[20];
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter 20 numbers");
        for(int i=0;i<20;i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter number to be searched");
        n=sc.nextInt();

        while(l<=u)
        {
            m=(l+u)/2;
            if(n>a[m])
                l=m+1;
            else
            if(n<a[m])
                u=m-1;
            else {
                flag = 1;
                break;
            }
        }
        if(flag==1)
        {
            System.out.println("Element found at position " + (m + 1));}
        else
        {
            System.out.println("Element not found");
        }


    }
}
