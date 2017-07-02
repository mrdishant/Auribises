/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gndec;
import java.util.Scanner;


public class Gndec 
{
	 static int r;
	public static int sum(int x)
	{       
	        int num;
	        num=x;
		for(int i=1;i<=num;i++)
		{
			r=r+i;
			}
		return r;
	}
	public static int half(int x)
	{
		int num;
		num=x;
		if(num%2==0)
		{
			r=num/2;
			return r;
		}
		else
		{
			num=num-1;
			r=num/2;
			return r;
		}
	}
public static void main(String[] args) 
{              int num,x,count;
    System.out.println("Enter a number between 1 to 9");
	Scanner obj= new Scanner(System.in);
    num=obj.nextInt();
    x=sum(num);
    if(x%2!=0)
    {
    	System.out.println("NO PAIRS EXIST!!!");
    }
    
//************************************************************************************    
    else
    {
    	if(num%2==0)
    	{
    		if(2+2==num)
    		{
    			count=1;
    			for(int i=1;i<=num;i++)
    			{
    				for(int j=1;j<=num;j++)
    				{
    					int r,n;
    					r=i+j;
    					
    			n=half(x);
    			if(r==n)
    			{
    				if(count%2==0)
    			
    			{
    					
    				System.out.println(i+" "+j);
    				count++;
    			}
    				else
    	    			
        			{
        				System.out.println("-"+i+" "+"-"+j);
        				count++;
        				
        			}
    				
    			}	
    			else
    			{
    			continue;
    			}
    			
    			
    			}
    				}}
    	

    				
 //***********************************************************
    	
    	else if(3+3==num)
    		{
    			count=1;
    			for(int i=1;i<=num;i++)
    			{
    				for(int j=1;j<=num;j++)
    				{
    					for(int k=1;k<=num;k++)
    					{
    					int r,n;
    					r=i+j+k;
    			n=half(x);
    			if(r==n)
    			{
    				if(count%2==0)
    			
    			{
    				System.out.println(i+" "+j+" "+k);
    				count++;
    			}
    				else
    	    			
        			{
        				System.out.println("-"+i+" "+"-"+j+" "+"-"+k);
        				count++;
        			}}}}}}
    		
    		
    		//*********************************************************************
    		else 
    		{
    			count=1;
    			for(int i=1;i<=num;i++)
    			{
    				for(int j=1;j<=num;j++)
    				{
    					for(int k=1;k<=num;k++)
    					{
    						for(int l=1;l<=num;l++)
    				{
    					int r,n;
    					r=i+j+k+l;
    			n=half(x);
    			if(r==n)
    			{
    				if(count%2==0)
    			
    			{
    				System.out.println(i+" "+j+" "+k+" "+l);
    				count++;
    			}
    				else
    	    			
        			{
        				System.out.println("-"+i+" "+"-"+j+" "+"-"+k+" "+"-"+l);
        				count++;
        			}}}}}}}
    	
    }
    	
    	//###########################################################
    	else
    	{
    		
    		if(2+3==num)
    		{
    			count=1;
    			for(int i=1;i<=num;i++)
    			{
    				for(int j=1;j<=num;j++)
    				{
    					int r,n;
    					r=i+j;
    			n=half(x);
    			if(r==n)
    			{
    				if(count%2==0)
    			
    			{
    				System.out.println(i+" "+j);
    				count++;
    			}
    				else
    	    			
        			{
        				System.out.println("-"+i+" "+"-"+j);
        				count++;
        			}}}}
    			for(int i=1;i<=num;i++)
    			{
    				for(int j=1;j<=num;j++)
    				{
    					for(int k=1;k<=num;k++)
    					{
    					int r,n;
    					r=i+j+k;
    			n=half(x);
    			if(r==n)
    			{
    				if(count%2==0)
    			
    			{
    				System.out.println(i+" "+j+" "+k);
    				count++;
    			}
    				else
    	    			
        			{
        				System.out.println("-"+i+" "+"-"+j+" "+"-"+k);
        				count++;
        			}}}}}
    		
    			
    		}
    		
 //***********************************************************
    		
    		
    		else if(3+4==num)
    		{
    			count=1;
    			for(int i=1;i<=num;i++)
    			{
    				for(int j=1;j<=num;j++)
    				{
    					for(int k=1;k<=num;k++)
    					{
    					int r,n;
    					r=i+j+k;
    			n=half(x);
    			if(r==n)
    			{
    				if(count%2==0)
    			
    			{
    				System.out.println(i+" "+j+" "+k);
    				count++;
    			}
    				else
    	    			
        			{
        				System.out.println("-"+i+" "+"-"+j+" "+"-"+k);
        				count++;
        			}}}}}
    			
    			for(int i=1;i<=num;i++)
    			{
    				for(int j=1;j<=num;j++)
    				{
    					for(int k=1;k<=num;k++)
    					{
    						for(int l=1;l<=num;l++)
    				{
    					int r,n;
    					r=i+j+k+l;
    			n=half(x);
    			if(r==n)
    			{
    				if(count%2==0)
    			
    			{
    				System.out.println(i+" "+j+" "+k+" "+l);
    				count++;
    			}
    				else
    	    			
        			{
        				System.out.println("-"+i+" "+"-"+j+" "+"-"+k+" "+"-"+l);
        				count++;
        			}}}}}}
    }
    		
    		
    		//*********************************************************************
    		else 
    		{
    			count=1;
    			for(int i=1;i<=num;i++)
    			{
    				for(int j=1;j<=num;j++)
    				{
    					for(int k=1;k<=num;k++)
    					{
    						for(int l=1;l<=num;l++)
    				{
    					int r,n;
    					r=i+j+k+l;
    			n=half(x);
    			if(r==n)
    			{
    				if(count%2==0)
    			
    			{
    				System.out.println(i+" "+j+" "+k+" "+l);
    				count++;
    			}
    				else
    	    			
        			{
        				System.out.println("-"+i+" "+"-"+j+" "+"-"+k+" "+"-"+l);
        				count++;
        			}}}}}}
    	
    			for(int i=1;i<=num;i++)
    			{
    				for(int j=1;j<=num;j++)
    				{
    					int r,n;
    					r=i+j;
    			n=half(x);
    			if(r==n)
    			{
    				if(count%2==0)
    			
    			{
    				System.out.println(i+" "+j);
    				count++;
    			}
    				else
    	    			
        			{
        				System.out.println("-"+i+" "+"-"+j);
        				count++;
        			}}}}
    		}
    	}
    	
    	
    }}
}