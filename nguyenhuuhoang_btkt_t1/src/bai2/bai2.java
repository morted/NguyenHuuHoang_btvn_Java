/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2;

import java.util.Scanner;

/**
 *
 * @author Administrato
 */
public class bai2 {
    public static void main(String[] args) {
       Scanner sc= new Scanner (System.in);
       float [] a=new float[100];
       float x;
       int n;
       System.out.println("nhap n:");
        n=sc.nextInt();
        System.out.println("nhap vao mang a: ");
        for(int i=0;i<n;i++)
        {
            System.out.print("a["+i+"]:");
            a[i]=sc.nextFloat();
        }
        System.out.println("xuat mang a: ");
        for(int i=0;i<n;i++)
        {
            System.out.println("a["+i+"]:"+a[i]);
        }
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
                if(a[j]<a[i])
                {
                    a[i]=a[j]+a[i];
                    a[j]=a[i]-a[j];
                    a[i]=a[i]-a[j];
                }
        }
        System.out.println("mang sau khi duoc sap xep la: ");
        for(int i=0;i<n;i++)
        {
            System.out.println("a["+i+"]:"+a[i]);
        }
        System.out.println("nhap vao x: ");
            x=sc.nextFloat();
        float dem=0;
        int kt=0;
        for(int i=1;i<=x/2;i++)
            if(x%i==0)
                dem+=i;
            else continue;
        if (dem==x)
            kt=1;
        if(kt==0)
        {
            System.out.println("x khong phai la so hoan hao: ");
        }
        else
        {
            n++;
            for(int i=n;i>0;i--)
            {
                a[i]=a[i-1];
            }
            a[0]=x;
            System.out.println("xuat mang a: ");
        for(int i=0;i<n;i++)
        {
            System.out.println("a["+i+"]:"+a[i]);
        }
        }
        
    }
   
}
