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
public class Leader {
        private String name;
        private int age;
        private int so_ngay_LD;

    public Leader(String name, int age, int so_ngay_LD) {
        this.name = name;
        this.age = age;
        this.so_ngay_LD = so_ngay_LD;
    }
        public void showl()
        {
            System.out.println("Leader "+name+"    "+age+" tuoi    so ngay lanh dao:"+so_ngay_LD);
        }
}
