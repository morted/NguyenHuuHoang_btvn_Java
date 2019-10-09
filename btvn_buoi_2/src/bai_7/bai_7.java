/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_7;

import java.util.Scanner;

/**
 *
 * @author Administrato
 */
public class bai_7 {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        float n,m;
        System.out.println("nhap so n: ");
        n=sc.nextFloat();
        System.out.println("nhap so m: ");
        m=sc.nextFloat();
        if(n>m)
            {
                System.out.println("max="+n);
                System.out.println("min="+m);
            }
        else
            if(m>n)
            {
                System.out.println("max="+m);
                System.out.println("min="+n);
            }
            else
                System.out.println("m=n");
    }
    
}
