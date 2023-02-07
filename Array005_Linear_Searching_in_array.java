/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Linear Searching in Array
package java_practice;
import java.util.*;
/**
 *
 * @author Nitish Kumar Maurya
 */
public class Array005_Linear_Searching_in_array {
    public static int linear_search(int []arr,int n,int ele)
    {
        for(int i=0;i<n;i++)
        {
            if(arr[i]==ele)
                return i+1;
        }
        return -1;
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
        int []arr={1,2,3,4,5,6,7,8,9,10};
        System.out.println("Enter the element to search");
        int ele=sc.nextInt();
        int pos=linear_search(arr,arr.length,ele);
        if(pos==-1)
        {
            System.out.println("Element is not present");
        }
        else{
            System.out.println("Element is present at position "+pos);
        }
    }
}
