import java.util.*;
class fibonacci
{
    public static void main()
    {
        Scanner SC=new Scanner(System.in);
        System.out.println("Enter 2 values");
        int m=SC.nextInt();
        int n=SC.nextInt();
        System.out.println("Enter the size of the series");
        int size=SC.nextInt();
        ArrayList<Integer> a=new ArrayList<Integer>();
        a.add(0,m);
        a.add(1,n);
        for(int i=2;i<size;i++)
        {
            a.add(i,a.get(i-1)+a.get(i-2));
        }
        System.out.println(a);
    }
}
        