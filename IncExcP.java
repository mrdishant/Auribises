/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mrdis
 */
//Program to Calculate Cardinality of Intersection of sets Using Inclusion Exclusion Principle
import java.util.*;
public class IncExcP 
{
    public static void main(String[] nt) 
    {
        Scanner in=new Scanner (System.in);
        System.out.print("Enter Number of sets: ");
        int n=in.nextInt();
        int [][] s=new int[n][];
        System.out.println("Enter Cardinality Type Wise (i.e:Singles,Pairs,Triples etc): ");
        for(int i=1;i<n;i++)
        {  s[i]=new int[choose(n,i)];
            for(int j=0;j<choose(n,i);j++)
            {
                s[i][j]=in.nextInt();
            }
            if(i==n-1)
            {
                break;
            }
            System.out.println("Enter Next Type");
        }
        System.out.print("Enter Value of Union:");
        int u=in.nextInt();
        int [] sum=new int[n];
        for(int i=1;i<n;i++)
        {
            for(int j=0;j<choose(n,i);j++)
            {
                sum[i]=sum[i]+s[i][j];
            }
        }
        int x=u;
        for(int i=1;i<n;i=i+2)
        {
            x=x-sum[i];
        }
        for(int i=2;i<n;i=i+2)
        {
            x=x+sum[i];
        }
        if(n%2==0)
        {
            x=-x;
        }
        System.out.println("Intersection: "+x);
    }
    public static int choose(int n,int i)
    {   int result=1;
        for(int j=1;j<=i;j++)
        {
            result=result*(n-j+1)/j;
        }
        return result;
    }
}
