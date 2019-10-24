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
public class class_dog {
    private String name;
    private int MP=100;
    Scanner sc=new Scanner (System.in);
    public void InputName()
    {
        System.out.println("dien name: ");
        name=sc.nextLine();
    }
    public void ShowMP()
    {
        System.out.println("MP hien tai la: "+MP);
    }
    public void Bark ()
    {
        if(name==null)
            System.out.println("xin loi ban chua dien ten");
        System.out.println(name+" sua");
        MP-=20;
    }
}
