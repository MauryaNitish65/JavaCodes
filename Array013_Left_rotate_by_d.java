/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Left rotate an array by d times
package java_practice;
import java.util.*;
/**
 *
 * @author Nitish Kumar Maurya
 */
public class Array013_Left_rotate_by_d {
    public static void rotate_by_d(int []arr,int l,int u)
    {
        while(l<u)
        {
            int k=arr[l];
            arr[l]=arr[u];
            arr[u]=k;
            l++;
            u--;
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
        System.out.println("Enter times to rotae");
        int d=sc.nextInt();
        d=d%n;
        rotate_by_d(arr,0,d-1);
        rotate_by_d(arr,d,n-1);
        rotate_by_d(arr,0,n-1);
        print(arr,n);
    }
}
