import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int n,m;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        m=sc.nextInt();
        int i;
        int a[]=new int[n];
        
        for(i=1;i<=m;i++)
        {
           int l,r;
            l=sc.nextInt();
            r=sc.nextInt();
            int j;
            for(j=l;j<=r;j++)
            {
                a[j-1]++;
            }
        }
        int q,k;
        Arrays.sort(a);
        q=sc.nextInt();
        for(k=1;k<=q;k++)
        {
         int x,c=0;
            x=sc.nextInt();
          
            for(i=n-1;i>0;i--)
        {
            if(a[i]>=x)
                c++;
                else
                    break;
        }
        
               System.out.println(c);     
        }

    }
}
