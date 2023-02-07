//Remove duplicate From Sorted Array
package java_practice;
import java.util.*;
/**
 *
 * @author Nitish Kumar Maurya
 */
public class Array010_Remove_duplicate_from_sorted_array {
    public static int duplicate_remove(int []arr,int n)
    {
        int k=1;
        for(int i=1;i<n;i++)
        {
            if(arr[i]!=arr[k-1])
            {
                arr[k]=arr[i];
                k++;
            }
        }
        return k;
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
        n=duplicate_remove(arr,n);
        print(arr,n);
    }
}
