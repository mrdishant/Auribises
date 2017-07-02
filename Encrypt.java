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
public class Encrypt 
{
    public static void main(String[] nt) 
    {
        Scanner in=new Scanner(System.in);
        String a;
        System.out.print("Enter Message: ");
        a=in.nextLine();
         if(a.length()%6!=0)
        {
            int x=a.length()%6;
           for (int u=1;u<=6-x;u++)
           {
               a=a+'.';                  //completing string
           }
        }
        String x=a.replace(' ', '*');            //replacing space with *
        int n=x.length()/6;
        char[][] e=new char[n][6];            //array to get encrypted message
        int i=0,k=0;
            while(k!=x.length())
            {  
                for(int j=0;j<6;j++)
               {  
                   e[i][j]=x.charAt(k);
                   k++;
               }
                i++;
            }
            System.out.println();
            System.out.print("Encrypted Message: ");
            for(int j=0;j<6;j++)
            {
                for(int s=0;s<i;s++)
                {
                    System.out.print(e[s][j]);
                }
            }
        System.out.println();
        System.out.println();
        System.out.println();
    }
}
