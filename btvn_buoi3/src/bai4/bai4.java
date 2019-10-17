/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai4;

import java.util.Scanner;

/**
 *
 * @author Administrato
 */
public class bai4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s, h=new String("hello");
        System.out.println("nhap vao chuoi cua ban:");
        s=sc.nextLine();
        int n=s.length(), kt=0;
        for(int i=0;i<n;i++)
        {
            if(s.charAt(i)==h.charAt(kt))
                kt++;
        }
        if(kt==5)
            System.out.println("yes");
        else
            System.out.println("no");
    }
    
}
