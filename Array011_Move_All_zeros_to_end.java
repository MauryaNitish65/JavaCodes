/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Move all the zeros to the end
package java_practice;
import java.util.*;
/**
 *
 * @author Nitish Kumar Maurya
 */
public class Array011_Move_All_zeros_to_end {
    public static void zeros_to_end(int []arr,int n)
    {
        int k=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]!=0)
            {
                int kp=arr[i];
                arr[i]=arr[k];
                arr[k]=kp;
                k++;
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
        zeros_to_end(arr,n);
        print(arr,n);
    }
}
