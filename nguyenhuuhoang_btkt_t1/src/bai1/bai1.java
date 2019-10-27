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
        Scanner sc= new Scanner (System.in);
        String a;
        int dem,t=0,kt=0;
        System.out.println("nhap vao chuoi:");
        a=sc.nextLine();
        dem=a.length();
        for(int i=0;i<dem;i++)
        {
            if(a.charAt(i)<48||a.charAt(i)>57)
                continue;
            else
                if((a.charAt(i)-48)%2!=0)
                    continue;
                 else
            {
                t=t+a.charAt(i)-48;
                kt++;
            }
        }
        System.out.println("tong cac so chan trong chuoi la: "+t);
        System.out.println("cac so chan la: "+kt);
    }
    
}
