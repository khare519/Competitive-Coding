import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int t;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        int m;
        for(m=1;m<=t;m++)
        {
            String s;
            s=sc.next();
            int c1=0,c2=0;
            int i;
            for(i=0;i<s.length();i++)
            {
                if(s.charAt(i)=='1')
                    c1++;
                else
                    c2++;
            }
            int result;
            result=(int)Math.min(c1,c2);
            System.out.println(result);
        }
    }
}
