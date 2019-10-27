/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai3;

import java.util.Scanner;

/**
 *
 * @author Administrato
 */
public class class_student {
    Scanner sc=new Scanner (System.in);
    private String name;
    private String masv;
    private int age;
    public void InputName()
    {
        System.out.println("nhap name: ");
        name=sc.nextLine();
        System.out.println("nhap masv: ");
        masv=sc.nextLine();
        System.out.println("nhap tuoi: ");
        age=sc.nextInt();
    }
}
