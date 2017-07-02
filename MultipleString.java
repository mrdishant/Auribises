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
public class MultipleString {

    public static void main(String[] nt) {
        Scanner in =new Scanner(System.in);
        System.out.print("Enter Number of Strings:");
        int n=in.nextInt();
        in.nextLine();
       String a[]=new String[n];
       System.out.println("Enter Strings:");
       for(int i=0;i<n;i++)
       {
           a[i]=in.nextLine();
       }
       System.out.println("Entered Strings:");
       for(int i=0;i<n;i++)
       {
           System.out.println(a[i]);
       }
    }
    
}
