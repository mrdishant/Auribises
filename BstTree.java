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
class node
{
    node right,left;
    int d;
    node()
    {
        d=0;
        right=left=null;
    }
    node(int a)
    {
        d=a;
        right=left=null;
    }
}
class tree
{
    node root;
    tree()
    {
        root=null;
    }
    void insert(int data)
    {
        root=insert(root,data);
    }
    node insert(node n,int data)
    {
        if(n==null)
        {
            n=new node(data);
        }
        else if(data<=n.d)
        {
            n.left=insert(n.left,data);
        }
        else
        {
            n.right=insert(n.right,data);
        }
        return n;
      }
    void inorder()
    {
        inorder(root);
        System.out.println();
    }
    void inorder(node s)
    {
        if(s!=null)
        {
            inorder(s.left);
            System.out.print(s.d+" ");
            inorder(s.right);
        }
    }
     void preorder()
    {
        preorder(root);
        System.out.println();
    }
    void preorder(node s)
    {
        if(s!=null)
        {
            System.out.print(s.d+" ");
            preorder(s.left);
            preorder(s.right);
            
        }
    }
    void postorder()
    {
        postorder(root);
        System.out.println();
    }
    void postorder(node s)
    {
        if(s!=null)
        {
            postorder(s.left);
            postorder(s.right);
            System.out.print(s.d+" ");
        }
    }
}
public class BstTree 
{
    public static void main(String [] nt)
    {
        
    
    Scanner in=new Scanner(System.in);
    System.out.println("Enter Number of Elements");
    int n=in.nextInt();
    tree r=new tree();
    System.out.println("Enter Elements:");
     for(int i=0;i<n;i++)
     {
         r.insert(in.nextInt());
     }
     System.out.print("Inorder: ");
     r.inorder();
     System.out.print("Postorder: ");
     r.postorder();
     System.out.print("Preorder: ");
     r.preorder();
    }
}
