/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai3;

/**
 *
 * @author Administrato
 */
public class Support {
        private String name;
        private int age;
        private String [] name_m=new String[4];
    public Support(String name, int age) {
        this.name = name;
        this.age = age;
    }
        public void shows()
        {
            System.out.println("Support "+name+"    "+age+" tuoi");
            System.out.println("danh sach thanh vien trong nhom: ");
            name_m[0]="A";
            name_m[1]="B";
            name_m[2]="C";
            name_m[3]="D";
            for(int i=0;i<4;i++)
            {
                System.out.println(name_m[i]);
            }
        }
}
