/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Find leader in an array
//one element is called Leader if there is no any element greater than or equal to the right of it
package java_practice;
import java.util.*;
/**
 *
 * @author Nitish Kumar Maurya
 */
public class Array014_Leader_in_an_array {
    public static void leader(int []arr,int n)
    {
        System.out.println(arr[n-1]);
        int kp=n-1;
        for(int i=n-2;i>=0;i--)
        {
            if(arr[i]>arr[kp])
            {
                System.out.println(arr[i]);
                kp=i;
            }
        }
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
        System.out.println("leaders of array");
        leader(arr,n);
    }
}
