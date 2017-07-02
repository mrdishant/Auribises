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
public class PerfectNumber 
{

    
    public static void main(String[] nt) 
    {
       Scanner in= new Scanner(System.in);
       System.out.print("Enter any Number: ");
       int n=in.nextInt();
       int temp=n;
       int sum=0;
       for(int i=1;i<n;i++)
       {
           if(temp%i==0)
           {
               sum=sum+i;
           }
       }
       if(sum==n)
       {
           System.out.println("Yes it is a Perfect Number");
       }
       else
       {
           System.out.println("No it is not a Perfect Number");
       }
    }
    
}
