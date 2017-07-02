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
public class DayFromDate 
{

    public static void main(String[] nt) 
    {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter Date:");
        int d=in.nextInt();
        System.out.print("Enter Month:");
        int m=in.nextInt();
        System.out.print("Enter Year:");
        int y=in.nextInt();
        int x=(y-1900)*365+(y-1900)/4;
       
        
        if(y%4==0&&m<=2)
        {
            x--;
        }
        
      
      
        
         switch(m)
         {
             case 12:x+=30;
             case 11:x+=31;
             case 10:x+=30;
             case 9:x+=31;
             case 8:x+=30;
             case 7:x+=31;
             case 6:x+=31;
             case 5:x+=30;
             case 4:x+=31;
             case 3:x+=28;
             case 2:x+=31;
         }
         x=x+d;
         x=x%7;
        String weekday;
        switch(x)
                {   
                    case 0:weekday="Sunday"; break;
                    case 1:weekday="Monday"; break;
                    case 2:weekday="Tuesday"; break;
                    case 3:weekday="Wednesday"; break;
                    case 4:weekday="Thrusday"; break;
                    case 5:weekday="Friday"; break;
                    case 6:weekday="Saturday"; break;
                    
                    default:System.out.println("Invalid day number");return;
                   
                }
        System.out.println("Weekday is "+weekday);
        
    }
    

}
