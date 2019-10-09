/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_6;

import java.util.Scanner;

/**
 *
 * @author Administrato
 */
public class bai_6 {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int n1,m1;
        float n2, m2;
        System.out.println("nhap so nguyen n1: ");
        n1=sc.nextInt();
        System.out.println("nhap so nguyen m1: ");
        m1=sc.nextInt();
        System.out.println("nhap so thuc n2: ");
        n2=sc.nextFloat();
        System.out.println("nhap so thuc m2: ");
        m2=sc.nextFloat();
        System.out.println("tong hai so nguyen la: "+(n1+m1));
        System.out.println("tong hai so thuc la: "+(n2+m2));
        System.out.println("tong n1+n2 la: "+(n1+n2));
        
    }
    
}
