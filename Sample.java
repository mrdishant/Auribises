/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mrdis
 */
import java.util.*;
class test
{
    int a[];
    test(int x)
    {
        a=new int[x];
    }
    void printarray(int i)
    {
        if(i==0)return;
        else printarray(i-1);
        System.out.println("Value:"+a[i-1]);
    }
}
public class Sample {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter Number of Terms:");
        int n=in.nextInt();
        test ob=new test(n);
        for(int i=0;i<ob.a.length;i++)
        {
            ob.a[i]=i;
        }
       ob.printarray(ob.a.length);
       for(int i=0;i<args.length;i++)
       {
           System.out.println("!!!"+args[i]);
       }
    }
    
}
