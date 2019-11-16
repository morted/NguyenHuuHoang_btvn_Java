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
public class BattleField {
    public static void main(String[] args) {
        human1 N1=new human1();
        human1 N2=new human1();
        N1.setTen("Nam");
        N2.setTen("Ngoc");
        N1.setHP(100);
        N2.setHP(10000);
        
        N1.Attack(N2);
        N1.show();
        N2.show();
        N1.Attack(N2);
        N1.show();
        N2.show();
        N1.Attack(N2);
        N1.show();
        N2.show();
        N1.Attack(N2);
        N1.show();
        N2.show();
        N1.Attack(N2);
        N1.show();
        N2.show();
        
        N2.Attack(N1);
        N1.show();
        N2.show();
        N2.Attack(N1);
        N1.show();
        N2.show();
        N2.Attack(N1);
        N1.show();
        N2.show();
        N2.Attack(N1);
        N1.show();
        N2.show();
        
        
        if(N1.getHP()>N2.getHP())
            System.out.println(N1.getTen()+" da chien thang "+N2.getTen());
        else
            if(N1.getHP()<N2.getHP())
                System.out.println(N1.getTen()+" da thua "+N2.getTen());
            else
                System.out.println(" hoa ");
    }
}
