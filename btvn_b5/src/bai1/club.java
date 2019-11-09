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
public class club {
    private String msv;
    private String ten;
    private int tuoi;

    public String getTen() {
        return ten;
    }
    private String lop;
    Scanner sc=new Scanner (System.in);
    public void input(){
        System.out.print("nhap vao msv: ");
        msv=sc.nextLine();
        System.out.print("nhap vao ten: ");
        ten=sc.nextLine();
        System.out.print("nhap vao tuoi: ");
        tuoi=sc.nextInt(); 
        System.out.print("nhap vao lop: ");
        lop=sc.nextLine();
        lop=sc.nextLine();
    }
    public void output(){
        System.out.println("msv:"+msv+"     ten:"+ten+"     tuoi:"+tuoi+"       lop:"+lop);
    }
}
