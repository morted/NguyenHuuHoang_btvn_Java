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
public class may_tinh {
    public float TinhTong(float a,float b)
    {
        float c;
        c=a+b;
        return c;
    }
    public float TinhTong(float a,float b,float c)
    {
        float s;
        s=a+b+c;
        return s;
    }
    public float TinhTong(float a[])
    {
        Scanner sc=new Scanner (System.in);
        float s=0;
        int n;
        System.out.println("nhap vao so so hang: ");
        n=sc.nextInt();
        System.out.println("nhap vao cac so hang: ");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextFloat();
            s+=a[i];
        } 
        return s;
    }
}
