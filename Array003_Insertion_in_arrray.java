/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//insertion in array
package java_practice;
import java.util.*;
/**
 *
 * @author Nitish Kumar Maurya
 */
public class Array003_Insertion_in_arrray {
    public static int insertion(int []arr,int n,int cap,int pos,int ele)
    {
        if(n==cap || pos>cap || pos<1)
            return n;
        for(int i=n-1;i>=pos-1;i--)
        {
            arr[i+1]=arr[i];
        }
        arr[pos-1]=ele;
        return n+1;
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
        int cap=10;
        System.out.println("Enter size of array");
        int n=sc.nextInt();
        System.out.println("Enter elements of array");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        print(arr,n);
        System.out.println("Enter the insertion element");
        int ap=sc.nextInt();
        System.out.println("Enter position");
        int ap1=sc.nextInt();
        n=insertion(arr,n,cap,ap,ap1);
        print(arr,n);
    }
}
