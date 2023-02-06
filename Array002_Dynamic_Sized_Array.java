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
public class Array002_Dynamic_Sized_Array {
    public static void print(ArrayList<Integer>ar)
    {
        System.out.println("Array Elements");
        for(int i:ar)
        {
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer>arr=new ArrayList<Integer>();
        byte cj=1;
        while(cj==1){
            System.out.println("Enter Element");
            arr.add(sc.nextInt());
            System.out.println("If Cotinue Press 1 otherwise 0");
            cj=sc.nextByte();
        }
        print(arr);
    }
}
