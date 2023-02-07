/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Check whether array is sorted or not
package java_practice;
import java.util.*;
/**
 *
 * @author Nitish Kumar Maurya
 */
public class Array008_Is_Array_Sorted {
    public static boolean sorted(int []arr,int n)
    {
        for(int i=1;i<n;i++)
        {
            if(arr[i]<arr[i-1])
                return false;
        }
        return true;
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
        boolean pos=sorted(arr,n);
        if(pos)
            System.out.println("Yes Array is Sorted");
        else
            System.out.println("No Array is not sorted");
    }
}
