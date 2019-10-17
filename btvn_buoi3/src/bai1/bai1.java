/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1;

import java.util.Scanner;

/**
 *
 * @author Administrato
 */
public class bai1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int[] a= new int[100];
        int n;
        System.out.println("nhap vao so phan tu cua mang");
        n=sc.nextInt();
        System.out.println("nhap vao cac gia tri cua mang:");
        for(int i=0;i<n;i++)
        {
            System.out.print("a["+i+"]:"); 
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            int kt=0;
            for(int j=0;j<n;j++)
            {
                if(a[i]<a[j])
                    kt++;
            }
            if(kt==2)
            {
                System.out.println("so can tim la: "+a[i]);
                break;
            }
        }
    }
    
}
