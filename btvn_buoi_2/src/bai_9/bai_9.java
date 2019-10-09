/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_9;

import java.util.Scanner;

/**
 *
 * @author Administrato
 */
public class bai_9 {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        float a,b,x;
         System.out.println("nhap a: ");
         a=sc.nextFloat();
         System.out.println("nhap b: ");
         b=sc.nextFloat();
         if(a==0&&b!=0)
            System.out.println("phuong trinh vo nghiem");
         else if(a==0&&b==0)
            System.out.println("pt co vo so nghiem");
              else
                {
                    x=-b/a;
                    System.out.println("pt co nghiem la: "+x);
                }
     }
}
