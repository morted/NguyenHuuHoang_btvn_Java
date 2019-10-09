/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_10;

import java.util.Scanner;
import java.lang.Math;

/**
 *
 * @author Administrato
 */
public class bai_10 {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        float a,b,c,dt;
         System.out.println("nhap a: ");
         a=sc.nextFloat();
         System.out.println("nhap b: ");
         b=sc.nextFloat();
         System.out.println("nhap c: ");
         c=sc.nextFloat();
         dt=b*b-4*a*c;
         if(dt<0)
             System.out.println("pt vo nghiem. ");
         else
             if(dt==0)
             {
                 System.out.println("pt co nghiem kep: x="+(-b/2*a));
             }
             else
             {
                 System.out.println("pt co 2 nghiem pb: x1="+((-b+Math.sqrt(dt))/(2*a)) +"  x2="+((-b-Math.sqrt(dt))/(2*a)));
             }
     }
    
}
