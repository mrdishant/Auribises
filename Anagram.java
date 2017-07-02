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
public class Anagram 
{
    public static void main(String[] nt) 
    {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter First String: ");
        String s1=in.nextLine();
        System.out.print("Enter Second String: ");
        String s2=in.nextLine();
        check(s1,s2);              //function to check if the entered strings are anagram
    }
    static void check(String a,String b)
    {   boolean status=true;
        a=a.replaceAll(" ", "");      //removing white spaces from strings
        b=b.replaceAll(" ", ""); 
        char[] s1=a.toLowerCase().toCharArray();    //converting string to character array
        char[] s2=b.toLowerCase().toCharArray();
        if(s1.length!=s2.length)
        {
            status=false;
        }
        else
        {
            Arrays.sort(s1);               //sorting array
            Arrays.sort(s2);
            if(!Arrays.equals(s1, s2))        //checking characters
            {
               status=false;
            }
        }
        if(status)
        {
            System.out.println("Yes these are Anagrams");
        }
        else
        {
            System.out.println("No these are not Anagrams");
        }
    }
}
