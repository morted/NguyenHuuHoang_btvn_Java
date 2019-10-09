/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_8;

import java.util.Scanner;

/**
 *
 * @author Administrato
 */
public class bai_8 {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        float n,m,p,max,min;
        System.out.println("nhap so n: ");
        n=sc.nextFloat();
        System.out.println("nhap so m: ");
        m=sc.nextFloat();
        System.out.println("nhap so p: ");
        p=sc.nextFloat();
        max=n;
        min=n;
        if(m>max&&m>p)
            {
                max=m;
            }
        else
            if(p>max&&p>m)
            {
                max=p;
            }
        if(m<min&&m<p)
            min=m;
        else
            if(p<min&&p<m)
                min=p;
        if(max==min)
            System.out.println("n=m=p");
        else
        {
            System.out.println("max="+max);
            System.out.println("min="+min);
        }
    }
}
