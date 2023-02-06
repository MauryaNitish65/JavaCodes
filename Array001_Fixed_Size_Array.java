/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_practice;
import java.util.*;
/**
 *
 * @author Nitish Kumar Maurya
 */
public class Array001_Fixed_Size_Array {

    /**
     * @param args the command line arguments
     */
    public static void print(int [] ar)
    {
        System.out.println("Array elements");
        for(int i=0;i<ar.length;i++)
        {
            System.out.print(ar[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int []arr=new int[5];
        System.out.println("Enter array1 elements");
        for(int i=0;i<5;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.print("1st");
        print(arr);
        System.out.println("Enter size of array2");
        int n=sc.nextInt();
        int []a=new int[n];
        System.out.println("Enter array2 elemets");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.print("2nd");
        print(a);
        int []ar={1,2,4,5,6,7,8};
        System.out.print("3rd");
        print(ar);
    }
    
}
