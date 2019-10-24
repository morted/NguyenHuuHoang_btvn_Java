/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1;
/**
 *
 * @author Administrato
 */
public class run_main {
    public static void main(String[] args) {
        class_person SonNghien=new class_person();
        class_person TuBueDe=new class_person();
        System.out.println("Person SonNghien:");
        SonNghien.setName("son");
        SonNghien.setAge(7);
        SonNghien.setHobby("nghien");
        SonNghien.setSex("yes");
        System.out.println(SonNghien.getName());
        System.out.println(SonNghien.getAge());
        System.out.println(SonNghien.getHobby());
        System.out.println(SonNghien.getSex());
        System.out.println("Person TuBueDe: ");
        TuBueDe.setName("Tu");
        TuBueDe.setAge(8);
        TuBueDe.setHobby("ga trai");
        TuBueDe.setSex("yes");
        System.out.println(TuBueDe.getName());
        System.out.println(TuBueDe.getAge());
        System.out.println(TuBueDe.getHobby());
        System.out.println(TuBueDe.getSex());
    }
}
