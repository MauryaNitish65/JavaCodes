/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_practice;
import  java.util.*;
/**
 *
 * @author Nitish Kumar Maurya
 */
public class Array004_Deletion_in_array {
    public static int deletion(int []arr,int n,int pos)
    {
        if(n==0 || pos>n || pos<1)
            return n;
        for(int i=pos-1;i<n-1;i++)
        {
            arr[i]=arr[i+1];
        }
        return n-1;
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
        int []arr=new int[10];
        System.out.println("Enter size of array");
        int n=sc.nextInt();
        System.out.println("Enter elements of array");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        print(arr,n);
        System.out.println("Enter position to delete");
        int ap1=sc.nextInt();
        n=deletion(arr,n,ap1);
        print(arr,n);
    }
}
