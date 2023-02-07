/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Second Largest Element in Array
package java_practice;
import java.util.*;
/**
 *
 * @author Nitish Kumar Maurya
 */
public class Array007_Second_Largest_Element_In_Array {
    public static int second_largest_element(int []arr,int n)
    {
        int res=-1,max=0;
        if(n==0 || arr.length==0)
            return -1; 
        for(int i=1;i<n;i++)
        {
            if(arr[i]>arr[max])
            {
                res=max;
                max=i;
            }
            else if(arr[i]<arr[max])
            {
                if(res==-1 || arr[res]<arr[i])
                    res=i;
            }
        }
        return res;
    }
    public static void print(int []arr,int n)
    {
        System.out.println("Arrray Elements");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        int []arr=new int[n];
        System.out.println("Enter the elements of array");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        print(arr,n);
        int pos=second_largest_element(arr,n);
        if(pos==-1)
            System.out.println("No second largest element");
        else
            System.out.println("The largest element is "+arr[pos]+" and at position "+(pos+1));
    }
}
