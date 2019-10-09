/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_4;

import java.util.Scanner;

/**
 *
 * @author Administrato
 */
public class bai_4 {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int n;
        float m;
        String xau;
        System.out.println("nhap so nguyen n: ");
        n=sc.nextInt();
        System.out.println("nhap so thuc m: ");
        m=sc.nextFloat();
        sc.nextLine();
        System.out.println("nhap vao xau: ");
        xau=sc.nextLine();
        System.out.println("so n vua nhap la: "+n);
        System.out.println("so m vua nhap la: "+m);
        System.out.println("xau vua nhap la: "+xau);
    }
    
}
