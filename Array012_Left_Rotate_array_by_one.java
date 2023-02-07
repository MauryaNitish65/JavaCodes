/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Left rotate array by one time
package java_practice;
import java.util.*;
/**
 *
 * @author Nitish Kumar Maurya
 */
public class Array012_Left_Rotate_array_by_one {
    public static void rotate_by_one(int []arr,int n)
    {
        int k=arr[0];
        for(int i=0;i<n-1;i++)
        {
            arr[i]=arr[i+1];
        }
        arr[n-1]=k;
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
        rotate_by_one(arr,n);
        print(arr,n);
    }
}
