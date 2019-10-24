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
       Scanner sc= new Scanner(System.in);
       String s;
        System.out.println("nhap vao chuoi cua ban:");
        s=sc.nextLine();
       int n=s.length(),t=0;
     for(int i=0;i<n;i++)
     {
         if(s.charAt(i)>57||s.charAt(i)<48)
             continue;
         else
         t=s.charAt(i)-'0'+t;
     }
      System.out.println("kq: "+t);
    }
}
